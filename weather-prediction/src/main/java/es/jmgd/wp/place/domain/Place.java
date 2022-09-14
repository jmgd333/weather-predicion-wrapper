package es.jmgd.wp.place.domain;

public class Place {

	private String latitude;
	private String longitude;
	private String placeName;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Place(String latitude, String longitude, String placeName) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.placeName = placeName;
	}
}
