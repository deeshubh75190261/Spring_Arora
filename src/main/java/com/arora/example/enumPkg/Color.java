package com.arora.example.enumPkg;

public enum Color {

	RED, BLACK, WHITE, PURPLE, PINK;

	private Color() {
		System.out.println("Constructor called for : " + this.toString());
	}

	public static void main(String[] args) {

		for (Color c : Color.values()) {
			System.out.println("Color " + c + " at the position of :" + c.ordinal());
		}

		System.out.println("Values of enum : " + Color.valueOf("RED"));
	}

}
