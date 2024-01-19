package demo.example.specs;

import demo.example.Interfaces.Engine;

public class EngineType implements Engine {
	public EngineType() {
		type="V1Engine";
		// TODO Auto-generated constructor stub
	}


	public EngineType(String type) {
		super();
		this.type = type;
	}


	String type;
	

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return type;
	}
	

}
