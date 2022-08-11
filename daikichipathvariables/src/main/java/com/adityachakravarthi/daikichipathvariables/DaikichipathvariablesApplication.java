package com.adityachakravarthi.daikichipathvariables;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class DaikichipathvariablesApplication {
        public static void main(String[] args) {
                SpringApplication.run(DaikichipathvariablesApplication.class, args);
        }
        
        // 1. Annotation
        // 3. Method that maps to the request route above
       
}

