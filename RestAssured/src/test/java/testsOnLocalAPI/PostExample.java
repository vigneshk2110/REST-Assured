package testsOnLocalAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostExample {
	
	@Test
	public void testPost() {
		
		
		
		JSONObject request = new JSONObject();
		request.put("FirstName", "Sarathi");
		request.put("LastName", "Partha");
		request.put("subjectID", "3");
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			post("/users").
			then().
			statusCode(201).
			log().all();
	}

}
