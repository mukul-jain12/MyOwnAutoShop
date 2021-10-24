package com.myownautoshop;

//Parent class
public class Car {
	
	//(put variable in private)
	private int speed;
	private double regularPrice;
	private String color;

	//Car constructor(paramet.)
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	//return sale price
	public double getSalePrice() {
		return regularPrice;
	}
}