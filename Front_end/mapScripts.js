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

function openJsonFile(){
	
	

   console.log("pass open F")
  var file = new File([""],"D:\Documents\Cours_Master_Ice_Annee_1\Cours3\IDM\Projet\Front\quartier.json");
  if (!file) {
    return;
  }
  var reader = new FileReader();
  reader.onload = function(e) {
    var contents = e.target.result;
	
	console.log("contents:"+contents);
    parseAndDraw(contents);
  };
  
	console.log("file:"+file);
  reader.readAsText(file);
  


	
}

*/
function openJsonFile(){
var file = new File([""],"D:\Documents\Cours_Master_Ice_Annee_1\Cours3\IDM\Projet\Front\quartier.json");
file.open("r"); // open file with read access
var str = "";
while (!file.eof) {
    // read each line of text
    str += file.readln() + "\n";
}
file.close();
alert(str);
}
function requete(){
	
	var xhr = createXmlHttpRequestObject();
    //xhr.overrideMimeType("application/json");
	
    //xhr.open('GET', 'quartier.json');
	xhr.open("GET","https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=recensement-population-2012-grands-quartiers-population-toulouse&rows=100&facet=libgq", true );
      
    xhr.onreadystatechange = function (){
		
		if (xhr.readyState == 4 && xhr.status == 200) {
			var jsonResponse = JSON.parse(xhr.responseText);
            parseAndDraw(jsonResponse)

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

   console.log("json:"+json);
	var jsongeometry = []
        
	for(i = 0; i<json.records.length; i++){
    //console.log(json[i].fields.libgq)
    //console.log(json[i].fields.geo_shape.coordinates[0])
	jsongeometry[i] = {
            "type": "Feature",
            "properties": {"party": "first",
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
        onEachFeature: onEachFeature
    }).addTo(mymap);
	
	
	return jsongeometry
	
}




//__Contour quartier_______________
var colorp = "#ff0000";


function getColor(d) {
    return d > 1000 ? '#800026' :
           d > 500  ? '#BD0026' :
           d > 200  ? '#E31A1C' :
           d > 100  ? '#FC4E2A' :
           d > 50   ? '#FD8D3C' :
           d > 20   ? '#FEB24C' :
           d > 10   ? '#FED976' :
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

function onEachFeature(feature, layer) {
    layer.on({
        mouseover: highlightFeature,
        mouseout: resetHighlight,
        click: zoomToFeature
    });
}
//___________________________


var mymap = L.map('mapid').setView([43.588747, 1.409683], 12);
L.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
		attribution: 'salut',
		maxZoom: 18,
		id: 'DS_PHR1A_201408101046059_FR1_PX_E001N43_0615_01728'
	}).addTo(mymap);
	

    


function start(){
	
 requete()
 
var buttSend = document.getElementById('buttonrequete').addEventListener('click',envoieRequete);


}










