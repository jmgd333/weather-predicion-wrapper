package es.jmgd.wp.place.domain;

public class Place {

	private String placeName;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Place() {
	}

	public Place(String placeName) {
		super();
		this.placeName = placeName;
	}
}
