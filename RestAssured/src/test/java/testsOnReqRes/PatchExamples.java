package testsOnReqRes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PatchExamples {
	
	@Test
	 public void testPatch(){

		JSONObject request = new JSONObject();
			request.put("name", "Vicky");
			request.put("job", "Developer");

			System.out.println(request.toJSONString());

			baseURI = "https://reqres.in/api";

			given().
				header("Content-Type", "application/json").
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(request.toJSONString()).
			when().
				patch("/users/2"). 
			then().
				statusCode(200).log().all();
			
			System.out.println("Status Code is ----->" + given().get().statusCode() );
	}

}
