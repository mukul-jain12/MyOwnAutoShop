package com.myownautoshop;

//Sub class of Car
public class Sedan extends Car {
	private int length;

	//constructor
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	//return sale price
	public double getSalePrice() {
		//calculating discount
		double discount = 0.90;
		if(length < 20) {
			discount = 0.95;
		}
		return super.getSalePrice() * discount;
	}
}
