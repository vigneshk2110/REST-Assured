package testsOnLocalAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PatchExample {
	
	@Test
	public void testPatch() {
		
		
		
		JSONObject request = new JSONObject();
		
		request.put("subjectID", "1");
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:3000";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			when().
			patch("/users/4").
			then().
			statusCode(200).
			log().all();
	}

}
