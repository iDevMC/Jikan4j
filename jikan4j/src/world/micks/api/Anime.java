package world.micks.api;

import org.json.JSONArray;
import org.json.JSONObject;

import world.micks.AnimeType;
import world.micks.IAnime;
import world.micks.http.JikanRequester;
import world.micks.http.RequestResult;

@SuppressWarnings("unused")
public class Anime {

	private String anime;
	private RequestResult result;
	private IAnime animeObject;

	public Anime(String anime) {
		this.anime = anime;
		this.result = new JikanRequester(anime).getData();
		this.animeObject = getAnime();
	}

	private IAnime getAnime() {

		JSONArray array = result.getResult();
		JSONObject obj = array.getJSONObject(0);

		return new IAnime() {

			@Override
			public boolean isAiring() { return obj.getBoolean("airing"); }

			@Override 
			public AnimeType getType() { return AnimeType.UNKNOWN; }

			@Override 
			public String getTitle() { return obj.getString("title"); }

			@Override
			public String getSynopsis() { return obj.getString("synopsis"); }

			@Override
			public String getStartDate() { return obj.getString("start_date"); }

			@Override
			public String getRating() { return obj.getString("rated"); }

			@Override
			public String getMalUrl() { return obj.getString("url"); }

			@Override
			public double getMalScore() { return obj.getDouble("score"); }

			@Override
			public int getMalMemberCount() { return obj.getInt("members"); }

			@Override
			public int getMalId() { return obj.getInt("mal_id"); }

			@Override
			public String getImage() { return obj.getString("image_url"); }

			@Override
			public String getEndDate() { return obj.optString("end_date"); }

			@Override
			public String getRequestHash() { return result.getProperties().getHash(); }

			@Override
			public boolean hasRequestCached() { return result.getProperties().isCache(); }

			@Override 
			public int getRequestCacheExpiry() { return result.getProperties().getExpiry(); }
		};
	}


	/** Anime Information */
	public String getImage() { return animeObject.getImage(); }
	public String getTitle() { return animeObject.getTitle(); }
	public String getSynopsis() { return animeObject.getSynopsis(); }
	public boolean isAiring() { return animeObject.isAiring(); }

	/** Anime Metadata */
	public String getRating() { return animeObject.getRating(); }
	public AnimeType getType() { return animeObject.getType(); }

	/** Anime Data Information */
	public String getStartDate() { return animeObject.getStartDate(); }
	public String getEndData() { return animeObject.getEndDate(); }

	/** MyAnimeList Details */
	public int getMalId() { return animeObject.getMalId(); }
	public int getMalMemberCount() { return animeObject.getMalMemberCount(); }
	public String getMalUrl() { return animeObject.getMalUrl(); }
	public double getMalScore() { return animeObject.getMalScore(); }

	/** Request Properties */
	public String getRequestHash() { return animeObject.getRequestHash(); }
	public boolean hasRequestCached() { return animeObject.hasRequestCached(); }
	public int getRequestCacheExpiry() { return animeObject.getRequestCacheExpiry(); }

}