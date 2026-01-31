package com.arora.example.markerInterface;

public class MyMarkerDemoMain {

	public static void main(String[] args) {

		MyMarkerDemo obj = new MyMarkerDemo();

		if (obj instanceof MyMarker) {
			System.out.println("Object is marked with MyMarker.");
			obj.display();
		} else {
			System.out.println("Object is not marked with MyMarker.");
		}

	}

}
