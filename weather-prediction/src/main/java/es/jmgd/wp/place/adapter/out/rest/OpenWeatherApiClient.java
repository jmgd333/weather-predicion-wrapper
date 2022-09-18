package es.jmgd.wp.place.adapter.out.rest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.jmgd.wp.place.adapter.out.rest.model.PlaceResponse;

@FeignClient(name = "open-weather-map-api", url = "https://api.openweathermap.org")
public interface OpenWeatherApiClient {
	@GetMapping("/geo/1.0/direct")
	public ResponseEntity<List<PlaceResponse>> checkPlaceAvailability(@RequestParam(value = "q") String place,
			@RequestParam(value = "limit") String limit, @RequestParam(value = "appid") String appid);
}
