package resttest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class demogettest {
	@Test
    
	@DisplayName("to check current location=> region & Weather_Description")
	public void getweatherdeatils() {
		given()
		.when()
		 .get("http://localhost:8080/current?location")
		.then()
		.statusCode(200)
		.assertThat().body("region", equalTo("Tamil Nadu"))
		.assertThat().body("weather_descriptions", equalTo("Partly cloudy"))
		.header("Content-Type","application/json");
	}
}
