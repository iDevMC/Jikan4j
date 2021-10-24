package world.micks;

public interface IAnime {
	
	/** Anime Information */
	public String getImage();
	public String getTitle();
	public String getSynopsis();
	public boolean isAiring();
	
	/** Anime Metadata */
	public AnimeType getType();
	public String getRating();
	
	/** Anime Date Information */
	public String getStartDate();
	public String getEndDate();
	
	/** MyAnimeList Details */
	public int getMalId();
	public int getMalMemberCount();
	public String getMalUrl();
	public double getMalScore();
	
	/** Request Properties */
	public String getRequestHash();
	public boolean hasRequestCached();
	public int getRequestCacheExpiry();
	
}