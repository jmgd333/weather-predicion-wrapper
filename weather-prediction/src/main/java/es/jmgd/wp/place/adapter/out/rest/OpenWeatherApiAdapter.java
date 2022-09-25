package es.jmgd.wp.place.adapter.out.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import es.jmgd.wp.place.adapter.out.rest.model.PlaceResponse;
import es.jmgd.wp.place.application.port.out.OpenWeatherApiPort;

@Component
public class OpenWeatherApiAdapter implements OpenWeatherApiPort {

	@Autowired
	private OpenWeatherApiClient restClient;

	@Value("${openweather.api.key}")
	private String apiKey;

	@Override
	public boolean isValidPlace(String placeName) {
		ResponseEntity<List<PlaceResponse>> apiResponse = restClient.checkPlaceAvailability(placeName, "5", apiKey);
		if (apiResponse.getBody().isEmpty())
			return false;
		else
			return true;
	}

}
