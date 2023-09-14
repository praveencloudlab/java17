package com;

public class Fruit {

	private String name;
	private String color;
	private String type;
	private double price;
	private int qty;

	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, String color, String type, double price, int qty) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", type=" + type + ", price=" + price + ", qty=" + qty
				+ "]";
	}

}
