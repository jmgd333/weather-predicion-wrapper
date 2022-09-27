package es.jmgd.wp.place.adapter.out.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import es.jmgd.wp.place.adapter.out.rest.model.PlaceResponse;
import es.jmgd.wp.place.application.port.out.OpenWeatherApiPort;
import es.jmgd.wp.place.domain.Place;

@Component
public class OpenWeatherApiAdapter implements OpenWeatherApiPort {

	@Autowired
	private OpenWeatherApiClient restClient;

	@Value("${openweather.api.key}")
	private String apiKey;

	@Override
	public Place getPlace(String placeName) {
		Place place = new Place();
		ResponseEntity<List<PlaceResponse>> apiResponse = restClient.checkPlaceAvailability(placeName + ",ES", "1",
				apiKey);
		if (apiResponse.getBody().isEmpty()) {
			return null;
		} else {
			place.setPlaceName(placeName);
			place.setLatitude(apiResponse.getBody().get(0).getLat());
			place.setLongitude(apiResponse.getBody().get(0).getLon());
			return place;
		}
	}

}
