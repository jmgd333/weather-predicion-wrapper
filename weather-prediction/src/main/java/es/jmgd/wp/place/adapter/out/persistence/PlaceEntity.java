package es.jmgd.wp.place.adapter.out.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import es.jmgd.wp.place.domain.Place;

@Document(collection = "PLACES")
public class PlaceEntity {

	@Id
	private String placeId;
	private String latitude;
	private String longitude;
	@Indexed(unique = true)
	private String placeName;

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
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

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public PlaceEntity(Place place) {
		this.latitude = place.getLatitude();
		this.longitude = place.getLongitude();
		this.placeName = place.getPlaceName();
	}
}
