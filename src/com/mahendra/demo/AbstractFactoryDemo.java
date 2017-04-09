package com.mahendra.demo;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		Car car1 = new CarA();
		buildCar((CarA) car1, new CarFacory1());
		
		System.out.println(car1);
		
		Car car2 = new CarB();
		buildCar((CarB) car2, new CarFacory2());
		
		System.out.println(car2);
	}

	private static void buildCar(Car car, CarFactory factory) {
		car.add(factory.getGear());
		car.add(factory.getColor());
		
	}

}
