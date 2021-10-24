package world.micks.http;

public class RequestProperties {

	private final String hash;
	private final boolean cache;
	private final int expiry;
	
	public RequestProperties(String hash, boolean cache, int expiry) {
		this.hash = hash;
		this.cache = cache;
		this.expiry = expiry;
	}
	
	public String getHash() { return hash; }
	public boolean isCache() { return cache; }
	public int getExpiry() { return expiry; }
	
}