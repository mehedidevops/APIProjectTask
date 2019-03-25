package com.collibra.qa.tests;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deserialize {
	
	@Test
	public void testCommentDeserialization() {

		Comment myDeserialized = get("https://jsonplaceholder.typicode.com/comments/{id}", 2).as(Comment.class);

		System.out.println(myDeserialized.toString());

		Assert.assertEquals("quo vero reiciendis velit similique earum", myDeserialized.getName());
	}

}
