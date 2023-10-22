package testsOnReqRes;

import static org.hamcrest.CoreMatchers.hasItem;


import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;


public class GetExamples {


	@Test
	public void testGet(){

		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().
		statusCode(200).
		body("data.first_name", hasItem("George"));
	}

	
}
