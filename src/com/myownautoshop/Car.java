package com.myownautoshop;

//Parent class
class Car {
	public int speed;
	public double regularPrice;
	public String color;

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