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
		// placeRepository.save(place);
		return true;
	}

}
