package com.mycompany.dish;

public class SingleDish {
	String name;
	String description = "";
	String price = "0";
        public void uniformNameToLowerCase() {
            name = name.toLowerCase();
        }
	public String toString () {
		return String.format("%s\t$%s", name, price);
	}
}
