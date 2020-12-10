package com.uas.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

public class Application{
    SpringApplication.run(Application.class, args);
}

@GetMapping(value="/validate")
public String getData(@PathParam("data") String data){
    System.out.println("in method getData");
    return data;
}
}

@SpringBootApplication
class Application {

	static void main(String[] args) {
		SpringApplication.run(Application, args)
	}

}