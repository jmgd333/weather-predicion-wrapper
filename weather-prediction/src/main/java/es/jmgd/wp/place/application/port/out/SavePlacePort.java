package es.jmgd.wp.place.application.port.out;

import es.jmgd.wp.place.domain.Place;

public interface SavePlacePort {
	boolean savePlace(Place place);
}
