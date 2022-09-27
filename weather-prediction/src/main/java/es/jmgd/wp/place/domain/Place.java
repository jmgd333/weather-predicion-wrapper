package es.jmgd.wp.place.domain;

public class Place {

	private String placeName;
	private String latitude;
	private String longitude;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

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

	public Place() {
	}

	public Place(String placeName) {
		super();
		this.placeName = placeName;
	}

	public Place(String placeName, String latitude, String longitude) {
		super();
		this.placeName = placeName;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
