package es.jmgd.wp.forecast.domain;

import java.time.LocalDateTime;

public class WeatherConditions {

	private String description;
	private float temperature;
	private float temperatureFeeling;
	private int cloudsPercentage;
	private float windSpeed;
	private LocalDateTime dateTime;
	private float probabilityOfPrecipitation;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getTemperatureFeeling() {
		return temperatureFeeling;
	}

	public void setTemperatureFeeling(float temperatureFeeling) {
		this.temperatureFeeling = temperatureFeeling;
	}

	public int getCloudsPercentage() {
		return cloudsPercentage;
	}

	public void setCloudsPercentage(int cloudsPercentage) {
		this.cloudsPercentage = cloudsPercentage;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public float getProbabilityOfPrecipitation() {
		return probabilityOfPrecipitation;
	}

	public void setProbabilityOfPrecipitation(float probabilityOfPrecipitation) {
		this.probabilityOfPrecipitation = probabilityOfPrecipitation;
	}

}
