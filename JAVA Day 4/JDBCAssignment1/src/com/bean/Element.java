package com.bean;

public class Element {
	private String weight;
	private String name;
	private String symbol;
	
	public Element() {
		
	}
	
	public Element(String weight, String name, String symbol) {
		super();
		this.weight = weight;
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Element [weight=" + weight + ", name=" + name + ", symbol=" + symbol + "]";
	}
}
