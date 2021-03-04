package p3;

public class Laptop {
	
	private int ram; // 0 
	private String brand;  // null
	private int cost;
	private int hdd;
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
		brand = "HP-101";
		cost = 20000;
		ram = 2;
		hdd = 500;
		System.out.println(" laptop constructor");
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	
	

}
