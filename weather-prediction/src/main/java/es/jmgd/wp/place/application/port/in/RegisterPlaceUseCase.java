package es.jmgd.wp.place.application.port.in;

import org.springframework.http.ResponseEntity;

import es.jmgd.wp.place.domain.Place;

public interface RegisterPlaceUseCase {
	ResponseEntity<Boolean> registerPlace(Place place);
}
