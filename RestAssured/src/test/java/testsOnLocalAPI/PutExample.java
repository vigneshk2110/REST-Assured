package testsOnLocalAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutExample {
	
	@Test
	public void testPut() {
		
		
		
		JSONObject request = new JSONObject();
		request.put("FirstName", "Peeky");
		request.put("LastName", "Blinder");
		request.put("subjectID", "3");
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			put("/users/4").
			then().
			statusCode(200).
			log().all();
	}

}
