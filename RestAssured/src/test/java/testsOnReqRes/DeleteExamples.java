package testsOnReqRes;

import static org.hamcrest.CoreMatchers.hasItem;


import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;


public class DeleteExamples {


	@Test
	public void testDelete(){

		baseURI = "https://reqres.in/api";
		given().delete("/users/2").then().
		statusCode(200).log().all();
	}

	
}
