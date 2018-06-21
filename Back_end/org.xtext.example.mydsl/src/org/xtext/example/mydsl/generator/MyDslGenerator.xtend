/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ecoreModelProject.Restaurant
import ecoreModelProject.Specification
import ecoreModelProject.Search

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		fsa.generateFile('\\pdc\\oc\\server\\EmbeddedJettyMain.java', '''
		package main.java.pdc.oc.server;

		
		import org.eclipse.jetty.server.Server;
		import org.eclipse.jetty.servlet.ServletContextHandler;
		
		import main.java.pdc.oc.servlet.RequestServlet;
		
		public class EmbeddedJettyMain {
			public static void main(String[] args) throws Exception {
				Server server = new Server(7071);
				ServletContextHandler handler = new ServletContextHandler(server, "/projet");
				handler.addServlet(RequestServlet.class, "/");
				server.start();
			}
		}
		''')
		
		fsa.generateFile('\\pdc\\oc\\servlet\\RequestServlet.java', '''
		package main.java.pdc.oc.servlet;
		
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.InputStream;
		import java.net.URL;
		import java.net.URLConnection;
		import java.net.URLEncoder;
		import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.Iterator;
		import java.util.Map;
		import java.util.Map.Entry;
		import java.util.Scanner;
		
		import javax.servlet.ServletException;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;
		
		import org.eclipse.jetty.http.HttpStatus;
		import org.eclipse.jetty.util.log.Log;
		import org.json.simple.JSONArray;
		import org.json.simple.JSONObject;
		import org.json.simple.parser.JSONParser;
		import org.json.simple.parser.ParseException;
		

		public class RequestServlet extends HttpServlet {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			ArrayList<String> locations;
			JSONArray jsonquartiers;
		
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				// creer array json contenant des objets json representant les quartier
				JSONParser parser = new JSONParser();
				try {
					Object obj = parser.parse(new FileReader("D:\\Baptiste\\Master\\PDC\\quartiers.json"));
					JSONArray jsonquartiers = (JSONArray) obj;
		�FOR s : (resource.contents.get(0) as Search).specifications�
											�IF s instanceof Restaurant�
					jsonquartiers = restaurantRequest(jsonquartiers);
					�ENDIF�
					�ENDFOR�
					jsonquartiers = cleanObject(jsonquartiers);
					jsonquartiers = computeTotal(jsonquartiers);
					resp.setStatus(HttpStatus.OK_200);
					resp.getWriter().println(jsonquartiers);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
			
			private JSONArray computeTotal(JSONArray jsonquartiers) {
					for (Object object : jsonquartiers) {
						JSONObject quartier = (JSONObject) object;
						JSONObject quartierTemp = (JSONObject) quartier.clone();
						quartierTemp.remove("name");
						int nb = 0;
						int total = 0;
						for (Object test : quartierTemp.entrySet()) {
							Map.Entry<String, Integer> bb = (Entry<String, Integer>) test;
							nb++;
							total += bb.getValue();
			
						}
						if (nb != 0) {
							quartier.put("total", total / nb);
						} else {
							quartier.put("total", 0);
						}
					}
					return jsonquartiers;
				}
				
				
				private JSONArray cleanObject(JSONArray jsonquartiers) {
					for (Object object : jsonquartiers) {
						JSONObject quartier = (JSONObject) object;
						quartier.remove("location");
						quartier.remove("radius");
						quartier.remove("number");
					}
					return jsonquartiers;
				}
				
				

				�FOR s : (resource.contents.get(0) as Search).specifications�
					�IF s instanceof Restaurant�						
						public JSONArray restaurantRequest(JSONArray jsonquartiers) throws IOException {
								String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json";
								String charset = java.nio.charset.StandardCharsets.UTF_8.name();
								String location;
								String radius;
								String types = "restaurant";
								String name = "Toulouse";
								String key = "AIzaSyA8H4o8Ze6aaTmnOHRcPjO_TEysUL4v0zA";
						
								for (Object object : jsonquartiers) {
									JSONObject quartier = (JSONObject) object;
									location = (String) quartier.get("location");
									radius = (String) quartier.get("radius").toString();
									String query = String.format("location=%s&radius=%s&types=%s&name=%s&key=%s", location,
											URLEncoder.encode(radius, charset), URLEncoder.encode(types, charset),
											URLEncoder.encode(name, charset), URLEncoder.encode(key, charset));
									// System.out.println(url + "?" + query);
									URLConnection connection = new URL(url + "?" + query).openConnection();
									connection.setRequestProperty("Accept-Charset", charset);
									InputStream response = connection.getInputStream();
									// Recupere la note de chaque resto et la compare avec la note voulue
									try (Scanner scanner = new Scanner(response)) {
										String responseBody = scanner.useDelimiter("\\A").next();
										JSONParser parser = new JSONParser();
										try {
											JSONObject reponse = (JSONObject) parser.parse(responseBody);
											JSONArray results = (JSONArray) reponse.get("results");
											float wanted = (float) �(resource.contents.get(0) as Search).specifications.get(0).arguments�;
											int numberOk = 0;
											for (int k = 0; k < results.size(); k++) {
												JSONObject resto = (JSONObject) results.get(k);
												float note = Float.parseFloat(resto.get("rating").toString());
												if (note >= wanted) {
													numberOk++;
												}
											}
											quartier.put("numberRestaurant", numberOk);
										} catch (ParseException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
						
								}
								return jsonquartiers;
							}
									�ENDIF�
								
							
								�ENDFOR�
			}


		''')
	
	}
}
