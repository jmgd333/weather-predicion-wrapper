package es.jmgd.wp.place.adapter.out.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import es.jmgd.wp.place.domain.Place;

@Document(collection = "PLACES")
public class PlaceEntity {

	@Id
	private String placeId;

	@Indexed(unique = true)
	private String placeName;

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public PlaceEntity(Place place) {
		this.placeName = place.getPlaceName();
	}
}
