package testsOnLocalAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteExample {
	
	@Test
	public void testDelete() {
		
		baseURI = "http://localhost:3000";

		given().delete("/users/4").then().
		statusCode(200).log().all();
	}

}
