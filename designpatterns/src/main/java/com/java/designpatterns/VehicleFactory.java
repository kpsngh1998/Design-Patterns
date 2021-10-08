package com.java.designpatterns;


// base class
abstract class Vehicle{
	public abstract int getWheel();
	@Override
	public String toString() {
		return "Wheel : " + this.getWheel();
	}
}

class Car extends Vehicle{
	private int wheel;
	
	public Car(int wheel){ 
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return wheel;
	}
	
}

class Bike extends Vehicle{
	private int wheel;
	
	public Bike(int wheel){
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return wheel;
	}
}

//Factory that creates instance based onn user requirement.  Removes instantiation of Client Class from client code 
public class VehicleFactory{
	
	public static Vehicle getInstance(String type, int wheel){
		if(type.equalsIgnoreCase("CAR")){
			return new Car(wheel);
		}else if(type.equalsIgnoreCase("BIKE")){
			return new Bike(wheel);
		}
		
		return null;
	}
}

