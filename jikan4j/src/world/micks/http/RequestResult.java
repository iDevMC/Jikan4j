package world.micks.http;

import org.json.JSONArray;

public class RequestResult {

	private RequestProperties properties;
	private JSONArray result;
	
	public RequestResult(RequestProperties properties, JSONArray result) {
		this.properties = properties;
		this.result = result;
	}
	
	public RequestProperties getProperties() { return properties; }
	public JSONArray getResult() {return result; } 
	
}