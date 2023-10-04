package com.Geolocation;

public class Wheather {

	private String weather_descriptions;
	private String observation_time;
	private double pressure;
	private double temperature;
	private double humidity;
	private String localtime;
	private String country;
	
	private String region;
	public String getWeather_descriptions() {
		return weather_descriptions;
	}
	public void setWeather_descriptions(String weather_descriptions) {
		this.weather_descriptions = weather_descriptions;
	}
	public String getObservation_time() {
		return observation_time;
	}
	public void setObservation_time(String observation_time) {
		this.observation_time = observation_time;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public String getLocaltime() {
		return localtime;
	}
	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "Wheather [weather_descriptions=" + weather_descriptions + ", observation_time=" + observation_time
				+ ", pressure=" + pressure + ", temperature=" + temperature + ", humidity=" + humidity + ", localtime="
				+ localtime + ", country=" + country + ", timezone_id=" +  ", region=" + region + "]";
	}
	
	
	
}
