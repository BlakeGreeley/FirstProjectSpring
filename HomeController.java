package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
        //@RequestMapping("/")
        // public String hello() {
                //return "Hello World!";
        //}
        
        @RequestMapping("/world")
        public String world() {
                return "Class level annotations are cool too!";
        }
        
        @RequestMapping("/greeting")
        public String index() {
        	return "Hello user!";
        }
        
        @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
        public String hello() {
        	return "Hello world! what route did you use to access me?";
        }
        
        @RequestMapping("/greeting/goodbye")
        public String goodbye() {
        	return "Goodbye World";
        }
}
