package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
		
	}

	public Color getColor() {
		return color;
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
