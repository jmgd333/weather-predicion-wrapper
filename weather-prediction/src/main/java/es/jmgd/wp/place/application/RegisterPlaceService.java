package es.jmgd.wp.place.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import es.jmgd.wp.place.application.port.in.RegisterPlaceUseCase;
import es.jmgd.wp.place.application.port.out.OpenWeatherApiPort;
import es.jmgd.wp.place.application.port.out.SavePlacePort;
import es.jmgd.wp.place.domain.Place;

@Service
public class RegisterPlaceService implements RegisterPlaceUseCase {

	@Autowired
	private SavePlacePort savePlacePort;

	@Autowired
	private OpenWeatherApiPort openWeatherApiPort;

	@Override
	public ResponseEntity<Boolean> registerPlace(Place place) {
		if (savePlacePort.savePlace(openWeatherApiPort.getPlace(place.getPlaceName())))
			return ResponseEntity.ok(true);
		else
			return ResponseEntity.ok(false);
	}
}
