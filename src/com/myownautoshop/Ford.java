package com.myownautoshop;

//Sub class Of Car
class Ford extends Car {
	//variables
	public int year;
	public int manufacturerDiscount;

	//constructor
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	//return sales prices
	public double getSalePrice() {
		return super.getSalePrice();
	}
}
