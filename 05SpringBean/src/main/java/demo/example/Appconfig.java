package demo.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.example.car.corolla;
import demo.example.car.swift;
//import demo.example.specs.v10;
//import demo.example.specs.v8;
import demo.example.specs.EngineType;

@Configuration
@ComponentScan("demo.org")
public class Appconfig {
	@Bean("corolla")
	public corolla Corolla() {
		return new corolla();
		
	}
	@Bean("swift")
	public swift Swift() {
		return new swift();
		
	}
//	@Bean("V8Engine")
//	public v8 V8() {
//		return new v8();
//		
//	}
	@Bean("v1Engine")
	public EngineType type() {
		return new EngineType();
		
	}



}
