package demo.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.example.Interfaces.Car;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Car mycar=context.getBean("corolla",Car.class);
		mycar.specs();
		context.close();
		
	}

}
