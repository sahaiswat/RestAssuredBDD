package com.qa.rest.tests;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutCallBDD {
	
	
	public static HashMap map=new HashMap();
	
	
	int empid=11254;
	
	
@BeforeClass
	public void putData()
	{
	map.put("name", RestUtils.getname());
	map.put("salary", RestUtils.getsalary());
	map.put("age", RestUtils.getage());
	
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/update/"+empid;
	
	}
	
	@Test
	public void testPUT()
	{
		given()
	  
	.contentType("application/json")
	.body(map)
	.when()
	.put()
	.then()
	.statusCode(200)
	.log().all();
						
	}
	
}
