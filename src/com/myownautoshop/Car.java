package com.myownautoshop;

//Parent class
public class Car {
	public int speed;
	public double regularPrice;
	public String color;

	//Car constructor
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public double getSalePrice() {
		return regularPrice;
	}
}