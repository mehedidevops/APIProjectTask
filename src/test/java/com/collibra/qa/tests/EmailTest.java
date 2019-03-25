package com.collibra.qa.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class EmailTest {
	
	
	@BeforeTest
	public void setup() {

		RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
	}
	
	
	@Test
	public void testEmail() {
			given()
			.when()
	        	.get("/comments/{id}", 2)
	        .then()
	        .assertThat()
	        	.statusCode(200)
	        	.body("email", equalTo("Jayne_Kuhic@sydney.com"));
			}
}
