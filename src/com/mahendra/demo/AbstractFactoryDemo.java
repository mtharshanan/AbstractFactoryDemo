package com.mahendra.demo;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		Car car1 = new CarA();
		buildCar((CarA) car1, new CarFacory1());
		
		System.out.println(car1);
	}

	private static void buildCar(Car car, CarFactory factory) {
		car.add(factory.getGear());
		car.add(factory.getColor());
		
	}

}
