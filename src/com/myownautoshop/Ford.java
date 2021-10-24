package com.myownautoshop;

//Sub class Of Car
public class Ford extends Car {
	//variables(private)
	private int year;
	private int manufacturerDiscount;

	//ford constructor
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	//return sales prices after discount
	public double getSalePrice() {
		return super.getSalePrice() - manufacturerDiscount;
	}
}
