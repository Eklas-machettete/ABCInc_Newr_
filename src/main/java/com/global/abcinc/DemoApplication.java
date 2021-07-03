package com.global.abcinc;
import com.global.abcinc.Stack;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Stack stack = new Stack(3);
		 
        stack.push("a");     
        stack.push("b");     

        stack.pop();       
        stack.pop();        
 
        stack.push("c");      
 
        System.out.println("The front element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
 
        
        if (stack.isEmpty()) {
            System.out.println("empty stack");
        }
        else {
            System.out.println("not empty");
        }
    }
		
		
	}



 
