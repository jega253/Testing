package com.Geolocation;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController 
public class WeatherApi {
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	private String base = "http://api.weatherstack.com/";
	private String key= "2d5f22aaab380feb0590c5f8c3a73151";
	
	
	@GetMapping("/current")
	public Wheather getCurrent(
			@RequestParam(name ="location",defaultValue = "madurai") String location ) {
		String a=restTemplate.getForObject(base+"current?access_key="+key+"&query="+location, String.class);
		JSONObject json = new JSONObject(a);
		Wheather wheather = new Wheather();
		wheather.setWeather_descriptions((String)json.getJSONObject("current").getJSONArray("weather_descriptions").get(0));
		wheather.setObservation_time(json.getJSONObject("current").getString("observation_time"));
		wheather.setCountry(json.getJSONObject("location").getString("country"));
		wheather.setHumidity(json.getJSONObject("current").getDouble("humidity"));
		wheather.setPressure(json.getJSONObject("current").getDouble("pressure"));
		
		wheather.setRegion(json.getJSONObject("location").getString("region"));
		wheather.setTemperature(json.getJSONObject("current").getDouble("temperature"));
		wheather.setLocaltime(json.getJSONObject("location").getString("timezone_id"));
		
		return wheather;
	}
	
}
