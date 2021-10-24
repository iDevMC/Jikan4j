package world.micks;

public enum AnimeType {

	TV("TV"),
	OVA("OVA"),
	SHORT("Short"),
	
	UNKNOWN("Soon..")
	;
	
	private String type;
	public String getType() { return type; }
	private AnimeType(String type) { this.type = type; }
	
}