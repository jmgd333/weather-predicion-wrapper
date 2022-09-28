package es.jmgd.wp.forecast.adapter.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.jmgd.wp.forecast.application.port.out.GetPlacesPort;

@Component
public class ForecastPersistenceAdapter implements GetPlacesPort {

	@Autowired
	private ForecastRepository forecastRepository;

}
