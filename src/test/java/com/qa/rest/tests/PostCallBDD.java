package com.qa.rest.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.junit.BeforeClass;



public class PostCallBDD {
	
	public static HashMap map=new HashMap();
	
	
	@BeforeClass
	public void postdata()
	{
		map.put("name", RestUtils.getname());
		map.put("salary", RestUtils.getsalary());
		map.put("age", RestUtils.getage());
	
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	    RestAssured.basePath="/create";
		
	}
	
	@Test
	public void testPost()
	{
	given()
	
	.contentType("application/json")
	.body(map)
	
	.when()
	.post("http://dummy.restapiexample.com/api/v1/create")
	
	.then()
	.statusCode(200)
	.and()
	.body("SuccessCode",equalTo ("Operation_Success"))
	.and()
	.body("Message", equalTo ("Operation completed successfully"))
	.log().all();
	}
	
	
}

