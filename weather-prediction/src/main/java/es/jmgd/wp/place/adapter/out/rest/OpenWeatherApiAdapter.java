package es.jmgd.wp.place.adapter.out.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import es.jmgd.wp.place.adapter.out.rest.model.PlaceResponse;
import es.jmgd.wp.place.application.port.out.OpenWeatherApiPort;

public class OpenWeatherApiAdapter implements OpenWeatherApiPort {

	@Autowired
	private OpenWeatherApiClient restClient;

	@Override
	public boolean isValidPlace(String placeName) {
		ResponseEntity<List<PlaceResponse>> apiResponse = restClient.checkPlaceAvailability(placeName, "5",
				"${OPENWEATHER_API_KEY}");
		// TODO BUSSINESS LOGIC
		return false;
	}

}
