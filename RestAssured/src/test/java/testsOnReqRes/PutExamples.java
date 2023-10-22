package testsOnReqRes;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class PutExamples {
	
	@Test
	 public void testPut(){

		JSONObject request = new JSONObject();
			request.put("name", "Vignesh");
			request.put("job", "Student");

			System.out.println(request.toJSONString());

			baseURI = "https://reqres.in/api";

			given().
				header("Content-Type", "application/json").
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(request.toJSONString()).
			when().
				put("/users/2").
			then().
				statusCode(200).log().all();
			
			System.out.println("Status Code is ----->" + given().get().statusCode() );
	}

}
