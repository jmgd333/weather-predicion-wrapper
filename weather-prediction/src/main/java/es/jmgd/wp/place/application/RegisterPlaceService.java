package es.jmgd.wp.place.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jmgd.wp.place.application.port.in.RegisterPlaceUseCase;
import es.jmgd.wp.place.application.port.out.SavePlacePort;
import es.jmgd.wp.place.domain.Place;

@Service
public class RegisterPlaceService implements RegisterPlaceUseCase {

	@Autowired
	private SavePlacePort savePlacePort;

	@Override
	public void registerPlace(Place place) {
		// TODO Validations
		savePlacePort.savePlace(place);
	}

}
