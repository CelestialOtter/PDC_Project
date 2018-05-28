window.addEventListener('load',start);
//Classes objets gemetriques
class POI{
    
    constructor(lati = 0.0 , longi = 0.0, id ){
           
            this.marker = L.marker([lati,longi], {icon: accidentIcon});
    }
    
    remove(){
        this.marker.remove();
    }
    
    addToMap(map){
        this.marker.addTo(map);
    }
    
    getMainInfos(){
        return 'lat: ' + lati + 'long: '+ longi + 'id: '+ id; 
    }
    
    
    
}

class Zone{
    constructor(idZone){
        this.idZone = idZone;
       
               
    }
    
    
    
    addToMap(map){
         this.circle = L.circle([43.588747, 1.409683], {
                    color: 'red',
                    fillColor: '#f03',
                    fillOpacity: 0.5,
                    radius: 400
                    });
        this.circle.addTo(map);
        
    }
    remove(){
        this.circle.remove();
    }
    
    
}

//_________________________________



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
var jsongeometry
function requete(){
	
	var xhr = createXmlHttpRequestObject();
    //xhr.overrideMimeType("application/json");
	
    //xhr.open('GET', 'quartier.json');
	xhr.open("GET","https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=recensement-population-2012-grands-quartiers-population-toulouse&rows=60&facet=libgq", true );
      
    xhr.onreadystatechange = function (){
		
		if (xhr.readyState == 4 && xhr.status == 200) {
			var jsonResponse = JSON.parse(xhr.responseText);
            jsongeometry = parseAndDraw(jsonResponse)

		}
	}
	xhr.send(null)

}    
function envoieRequete(){
	 alert("Button clicked, id "+this.id+", text"+this.innerHTML);
	 
	var xhr = createXmlHttpRequestObject();
    //xhr.overrideMimeType("application/json");
    //xhr.open('GET', 'recensement-population-2012-grands-quartiers-population-toulouse.json', true);
	xhr.open("GET","", true );
      
    xhr.onreadystatechange = function (){
		
		if (xhr.readyState == 4 && xhr.status == 200) {
			var jsonResponse = JSON.parse(xhr.responseText);
           

		}
	}
	xhr.send(null)
}


var geojson
 
function parseAndDraw(json){

	var jsongeometry = []
        
	for(i = 0; i<json.records.length; i++){
    //console.log(json[i].fields.libgq)
    //console.log(json[i].fields.geo_shape.coordinates[0])
	jsongeometry[i] = {
            "type": "Feature",
            "properties": {"party": "first",
						   "density": i,
							"param": getParamQuarter(name) ,
                            "name": json.records[i].fields.libgq},
            "geometry": {
                "type": "Polygon",
                "coordinates": [json.records[i].fields.geo_shape.coordinates[0]]
            }

        }
    }
		
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

function getParamQuarter(name){
	
	
	/*for(i = 0; i<jsonP.length; i++){
		if(jsonP[i].name==name){*/
			
					//for(j = 0; j<jsonP[i].length; j++){
					
							param = [
							"type", "Feature"]
							
							
					//}
		/*		
		}
    }*/
	return param
}


//__Contour quartier_______________
var colorp = "#ff0990";


function getColor(d) {
    return d%11 > 10? '#800026' :
           d%11 > 9  ? '#BD0026' :
           d%11 > 8  ? '#E31A1C' :
           d%11 > 7  ? '#FC4E2A' :
           d%11 > 6   ? '#FD8D3C' :
           d%11 > 5   ? '#FEB24C' :
           d%11 > 4   ? '#FGD006' :
           d%11 > 3   ? '#FED976' :
           d%11 > 2   ? '#FAA666' :
           d%11 > 1   ? '#FAAA06' :
                      '#FFEDA0';
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


 var feat
function onEachFeature(feature, layer) {
	

    layer.on({
        mouseover: highlightFeature,
        mouseout: resetHighlight,
        dblclick: zoomToFeature,
		click: function() { 
		str = feature.properties.name+" ";
		
		for(i = 0; i<feature.properties.param.length; i++){
			
			str = str + " \_!_!_!_/"+feature.properties.param[i];
			
		}

		document.getElementById("textclickQuartier").innerHTML = str;
		
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
var accidentIcon = L.icon({
		iconUrl: 'pointSpot.png',

		iconSize:     [9, 9], // size of the icon
		iconAnchor:   [5, 5], // point of the icon which will correspond to marker's location
		popupAnchor:  [0, -12] // point from which the popup should open relative to the iconAnchor
	});

//var marker = L.marker([43.60222440264482, 1.4405517136139772], {icon: accidentIcon}).addTo(mymap);
    


function start(){
	
 requete()
 


}










