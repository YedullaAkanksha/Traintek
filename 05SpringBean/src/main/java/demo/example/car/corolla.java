package demo.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import demo.example.Interfaces.Car;
import demo.example.Interfaces.Engine;

public class corolla implements Car{
	
	@Autowired
	@Qualifier("v1Engine")
	Engine engine;
	
	@Override
	public void specs() {
		
		System.out.println("sedan from toyota with engine  "+engine.specs());
	}

}
