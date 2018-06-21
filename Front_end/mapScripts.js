window.addEventListener('load',start);




function createXmlHttpRequestObject()
{  var xdr = null;

    

    if (window.XDomainRequest) {

        xdr = new XDomainRequest(); 

    } else if (window.XMLHttpRequest) {

        xdr = new XMLHttpRequest(); 

    } else {

        alert("Votre navigateur ne gère pas l'AJAX cross-domain !");

    }

    

    return xdr; 
}
/*
L.geoJSON(jsongeometry[30],{
        style: '#800026'
    }).addTo(mymap);
*/
var xhr 
var jsongeometry
function requete(){
	
	xhr = createXmlHttpRequestObject();
    //xhr.overrideMimeType("application/json");
	console.log("Requete 1 crée")
    xhr.overrideMimeType("application/json");
    //xhr.open('GET', 'quartier.json');
	xhr.open("GET","https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=recensement-population-2012-grands-quartiers-population-toulouse&rows=60&facet=libgq", true );
    console.log("requete 1 envoyé")
    xhr.onreadystatechange = function (){
		
		if (xhr.readyState == 4 && xhr.status == 200) {
			var jsonResponse = JSON.parse(xhr.responseText);
			console.log("requete 1 reçu")
			var jsonQuarter 
			// parseAndDraw( jsonQuarter, jsonResponse)
            jsongeometry = getJsonParamsQuarters(jsonResponse)

		}
	}
	console.log("requete 1 fermé")
xhr.send(null)
}    
var geojson
 
function getJsonParamsQuarters(jsonQuarter){
	
	var xtr = createXmlHttpRequestObject();
	
	console.log("Requete 2 crée")
    //xhr.overrideMimeType("application/json");
	
    xtr.overrideMimeType("application/json");
    //xhr.open('GET', 'quartier.json');
	xtr.open("GET","http://localhost:7074/projet/", true );
    console.log("requete 2 envoyé")
    xtr.onreadystatechange = function (){
	
	console.log("pass4 p1: "+xtr.readyState+"  p2: "+xtr.status )
		if (xtr.readyState == 4 && xtr.status == 200) {
			var jsonResponse = JSON.parse(xtr.responseText);
			console.log("requete 2 reçu")
			
			parseAndDraw(jsonQuarter,jsonResponse)

		}
	}
	
	console.log("requete 2 fermé")
	xtr.send(null)
} 
function parseAndDraw(jsonQuarterGeo,jsonParamsQuarters){

	var jsongeometry = []
    
	console.log("avant parse")
	
	
	// console.log(jsonParamsQuarters[0].name)
	for(i = 0; i<jsonQuarterGeo.records.length; i++){
		
	var name = jsonQuarterGeo.records[i].fields.libgq;
	console.log("parse quartier: "+name)
    //console.log(jsonQuarterGeo[i].fields.libgq)
    //console.log(jsonQuarterGeo[i].fields.geo_shape.coordinates[0])
	var note = getNote(jsonParamsQuarters,name);
	
	console.log("note 1: "+note)
	jsongeometry[i] = {
            "type": "Feature",
            "properties": {"party": "first",
						   "density": note,
							"param": getParamQuarter(jsonParamsQuarters,name) ,
                            "name": jsonQuarterGeo.records[i].fields.libgq
							},
            "geometry": {
                "type": "Polygon",
                "coordinates": [jsonQuarterGeo.records[i].fields.geo_shape.coordinates[0]]
            }

        }
    }
	console.log("parse quartier: "+name+"  OK")
		
    L.geoJSON(jsongeometry, {
        style: function(feature) {
            switch (feature.properties.party) {
                case 'first': return {color: colorp};
               
            }
        }
    }).addTo(mymap);

    geojson = L.geoJson(jsongeometry, {
        style: style,
        onEachFeature:onEachFeature
    }).addTo(mymap);
	
	
	
	
	return jsongeometry
	
}

function getParamQuarter(jsonP,name){
	
	console.log("recup param quartier: "+name)
	
	var param = [];
	for(i = 0; i<jsonP.length; i++){
		if(jsonP[i].name==name){
			for (var key in jsonP[i]){
				// jsonP[i].map(function(key,value) {
					if(key!="name" && key!= "number"){
						
						if(key=="numberRestaurant" ){
						
							// console.log("key :  "+key);
							param.push(""+"Nombre de restaurant"+" : "+jsonP[i][key]);
						}
						else if(key=="total"){
						
							// console.log("key :  "+key);
							param.push(""+"Note"+" : "+jsonP[i][key]);
						}else{
							// console.log("key :  "+key);
							param.push(""+key+" : "+jsonP[i][key]);
						}
					}
				// });
			}
					
							
							
							
			
			console.log("param quartier: "+name+"  recup ok")		
				
			return param
		}
    }
	return param
}
function getNote(jsonP,name){
	
	console.log("recup note quartier: "+name)
	
	var note ;
	for(i = 0; i<jsonP.length; i++){
		if(jsonP[i].name==name){
			
					note = jsonP[i].total;
				
					console.log("note  :  "+ jsonP[i].total);
					return note
			}		
			console.log("note quartier: "+name+"  recup ok")		
				
			
		}
		return note
    }
	

//__Contour quartier_______________
var colorp = "#ff0990";


function getColor(d) {
    return  d>=10  ? '#378B2E' :
            d==9   ? '#378B2E' :
            d==8   ? '#86A136' :
            d==7   ? '#86A136' :
            d==6   ? '#AAA039' :
            d==5   ? '#AAA039' :
            d==4   ? '#AA8339' :
            d==3   ? '#AA8339' :
            d==2   ? '#AA6239' :
            d==1   ? '#AA6239' :
                      '#330000';
					  
					  
}

function style(feature) {
    return {
        fillColor: getColor(feature.properties.density),
        weight: 2,
        opacity: 1,
        color: 'white',
        dashArray: '3',
        fillOpacity: 0.7
    };
}


function highlightFeature(e) {
    var layer = e.target;

    layer.setStyle({
        weight: 5,
        color: '#666',
        dashArray: '',
        fillOpacity: 0.7
    });

    if (!L.Browser.ie && !L.Browser.opera && !L.Browser.edge) {
        layer.bringToFront();
    }
	
}
function resetHighlight(e) {
    geojson.resetStyle(e.target);
	
}

function zoomToFeature(e) {
	
    mymap.fitBounds(e.target.getBounds());
	}

var info = L.control();




 var feat
function onEachFeature(feature, layer) {
	

    layer.on({
        mouseover: highlightFeature,
        mouseout: resetHighlight,
        dblclick: zoomToFeature,
		click: function() { 
		str = feature.properties.name;
		
		for(i = 0; i<feature.properties.param.length; i++){
			
			// console.log("val :  "+feature.properties.param[i])
			str = str + " <br/>  "+feature.properties.param[i];
			
		}
		info.update(str);

		//document.getElementById("textclickQuartier").innerHTML = str;
		
			layer.setStyle({
				weight: 5,
				color: '#800026',
				
				dashArray: '',
				fillOpacity: 0.7
			});

			if (!L.Browser.ie && !L.Browser.opera && !L.Browser.edge) {
				layer.bringToFront();
			}		
		}
		
    });
	
	
}
//___________________________


var mymap = L.map('mapid').setView([43.588747, 1.409683], 12);
L.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
		attribution: 'Toulouse',
		maxZoom: 18,
		id: 'DS_PHR1A_201408101046059_FR1_PX_E001N43_0615_01728'
	}).addTo(mymap);
	
L.control.scale().addTo(mymap);
var legend = L.control({position: 'bottomright'});

legend.onAdd = function (map) {

    var div = L.DomUtil.create('div', 'info legend'),
        grades = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        labels = [];

    // loop through our density intervals and generate a label with a colored square for each interval
    for (var i = 0; i < grades.length; i++) {
        div.innerHTML +=
            '<i style="background:' + getColor(grades[i] + 1) + '"></i> ' +
             (grades[i + 1] ? ' '+ grades[i + 1] + '<br>' : '+');
    }

    return div;
};

legend.addTo(mymap);



info.onAdd = function (mymap) {
    this._div = L.DomUtil.create('div', 'info'); // create a div with a class "info"
	
    this.update();
    return this._div;
};

// method that we will use to update the control based on feature properties passed

info.update = function (props) {
    this._div.innerHTML = props;
};

info.addTo(mymap);
info.update('<h4>INFORMATIONS</h4>')

function start(){
	
 requete()
 


}










