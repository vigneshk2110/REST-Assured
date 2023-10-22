package testsOnLocalAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetExample {
	
	@Test
	public void testGet() {
		
		baseURI = "http://localhost:3000";
		
		given().get("/users").
		then().
		statusCode(200).
		log().all();
	}

}
