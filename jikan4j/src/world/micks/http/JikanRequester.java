package world.micks.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class JikanRequester {

	private String urlBase = "https://api.jikan.moe/v3/search/anime?q=";
	private String displayname;
	private RequestResult data;

	public JikanRequester(String displayname) {
		this.displayname = displayname.replace(" ", "%20");
		try { data = requestAllProperties(); } 
		catch (IOException | InterruptedException e) { data = null; }
	}
	
	public RequestResult getData() { return data; }

	private RequestResult requestAllProperties() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(urlBase + displayname))
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		JSONObject obj = new JSONObject(response.body());
		
		RequestProperties properties = new RequestProperties(obj.getString("request_hash"), obj.getBoolean("request_cached"), obj.getInt("request_cache_expiry"));
		JSONArray result = obj.getJSONArray("results");
		return new RequestResult(properties, result);
	}

	@Override
	public String toString() { return "JikanRequester[request=" + urlBase + displayname + ", anime=" + displayname + "]"; }

}