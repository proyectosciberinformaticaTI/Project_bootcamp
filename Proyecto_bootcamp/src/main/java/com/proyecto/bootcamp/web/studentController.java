package com.proyecto.bootcamp.web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class studentController {

	

	  @GetMapping(
			    value = "/index",
			    produces = {
			      MediaType.APPLICATION_STREAM_JSON_VALUE,
			      MediaType.APPLICATION_JSON_VALUE
			    }
)
	public void listStudents() {
		
		
System.out.println("ffffff");
	  
	  
}
	  
	  
	  
	  @GetMapping(
			    value = "/index",
			    produces = {
			      MediaType.APPLICATION_STREAM_JSON_VALUE,
			      MediaType.APPLICATION_JSON_VALUE
			    }
)
	  public void listParents() {
		  
		  
		  
		  
	  }
	  
	
	
}
