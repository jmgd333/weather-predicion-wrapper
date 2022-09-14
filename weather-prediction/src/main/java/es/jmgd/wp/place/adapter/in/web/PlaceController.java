package es.jmgd.wp.place.adapter.in.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.jmgd.wp.place.application.port.in.RegisterPlaceUseCase;
import es.jmgd.wp.place.domain.Place;

@RestController
@RequestMapping(path = "/v1/place")
public class PlaceController {

	@Autowired
	private RegisterPlaceUseCase registerPlaceUseCase;

	@PostMapping
	public ResponseEntity<Boolean> registerPlace(@RequestBody Place place) {
		return registerPlaceUseCase.registerPlace(place);
	}

}
