package com.revature.clothing;

public class Sweater extends Clothing implements Wearable {

	public Sweater() {
		super();

	}

	public Sweater(String color, String size, String style, String brand, String fabric, boolean top, boolean bottom) {
		super(color, size, style, brand, top, bottom, fabric);

		System.out.println("boat noargs constructor completed");
	}

	public boolean isRequired(int temperature) {
		if (temperature <= 40) {
			System.out.println("Sweater is required");
			return true;
		} else {
			System.out.println("Sweater is NOT required");
			return false;
		}
	}

	@Override
	public void putOn() {
		System.out.println("put sleaves on first");

	}

	@Override
	public void takeOff() {
		System.out.println("take ");

	}

	public void warmUp() {
		System.out.println("Sweater warms you up");
	}

}