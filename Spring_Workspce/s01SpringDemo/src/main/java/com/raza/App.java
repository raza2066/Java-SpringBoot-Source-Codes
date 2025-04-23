package com.raza;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        
        obj.code();
        obj.age = 15;
        System.out.println(obj.age);
        
        //prototype scope creates a new object "obj2" age wont be the same as "obj"
        Alien obj2 = (Alien) context.getBean("alien");
        obj2.code();
        System.out.println(obj2.age);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
