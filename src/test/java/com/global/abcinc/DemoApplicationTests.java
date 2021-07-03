package com.global.abcinc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		
		Stack stack= new Stack(3);
		 
        stack.push("a");     
        stack.push("b");     

        stack.pop();       
        stack.pop();        
 
        stack.push("c");      
 
        System.out.println("The front element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
 
        assertEquals( stack.peek(), "insertc");
        assertEquals( stack.peek(), "1");
        
        
        
	}

}
