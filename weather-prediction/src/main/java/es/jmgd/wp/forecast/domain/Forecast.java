package es.jmgd.wp.forecast.domain;

import java.util.List;

public class Forecast {

	private String placeName;

	private List<WeatherConditions> conditions;

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public List<WeatherConditions> getConditions() {
		return conditions;
	}

	public void setConditions(List<WeatherConditions> conditions) {
		this.conditions = conditions;
	}

	public Forecast(String placeName, List<WeatherConditions> conditions) {
		super();
		this.placeName = placeName;
		this.conditions = conditions;
	}
}
