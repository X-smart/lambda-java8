package cn.com.taiji.bean;

public class Car {

	private double Price;
	private String color;
	private String size;
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getColor() {
		return color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(double price, String color, String size) {
		super();
		Price = price;
		this.color = color;
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Car [Price=" + Price + ", color=" + color + ", size=" + size + "]";
	}
	
	
}
