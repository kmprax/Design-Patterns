/*
 * Kimberly M. Praxel
 * 10/20/16
 * JsonWriter.java
 */

package edu.greenriver.it.fileio;


import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.util.*;


import edu.greenriver.it.products.*;


public class JsonWriter implements Writer{

	/**
	 * This saves an object to as json object file into the data folder
	 * 
	 * @param object
	 *            - a product object
	 */
	@SuppressWarnings("unchecked")
	public void saveObject(Product object){
		JSONObject productObject = new JSONObject();
		productObject.put("name", object.getName());
		productObject.put("price", object.getPrice());
		JSONArray keywords = new JSONArray();
		for(String keyword: object.getKeywords()){
			keywords.add(keyword);
		}
		productObject.put("keywords", keywords);
		try{
			FileWriter fileWriter = new FileWriter(getFilename(object.getName()));
			fileWriter.write(productObject.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	/**
	 * This loads a json object file from the data folder
	 * 
	 * @param name
	 *            - name of file
	 * @return product - from file
	 */
	public Product loadObject(String name){
		JSONParser parser = new JSONParser();
		try{
			Object object = parser.parse(new FileReader(getFilename(name)));
			JSONObject productObject = (JSONObject)object;
			String productsName = (String)productObject.get("name");
			double productsPrice = (Double)productObject.get("price");
			JSONArray keywords = (JSONArray)productObject.get("keywords");
			String [] productsKeywords = new String[keywords.size()];
			Iterator<String> iterator = keywords.iterator();
			int i = 0;
			while(iterator.hasNext()){
				productsKeywords[i] = (String)(iterator.next());
				i++;
			}
			return new Product(productsName, productsPrice, productsKeywords);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


	private String getFilename(String name){
		return "data/" + name + ".json";
	}
}
