package br.com.alura.forum.controller;

import org.junit.Assert;
import org.junit.Test;



public class HelloControllerTest {
	
	@Test
	public void HelloWorldTest() {
		HelloController controller = new HelloController();
		
		 String actual =  controller.hello();
		 String expected =  "Hello World!";
		 
		 Assert.assertEquals(expected, actual);
	}
	
}
