package es.jmgd.wp.place.adapter.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.jmgd.wp.place.application.port.out.SavePlacePort;
import es.jmgd.wp.place.domain.Place;

@Component
public class PlacePersistenceAdapter implements SavePlacePort {

	@Autowired
	private PlaceRepository placeRepository;

	@Override
	public boolean savePlace(Place place) {
		if (place == null || placeRepository.existsByPlaceName(place.getPlaceName())) {
			return false;
		} else {
			try {
				placeRepository.save(new PlaceEntity(place));
				return true;
			} catch (IllegalArgumentException e) {
				return false;
			}
		}
	}

}
