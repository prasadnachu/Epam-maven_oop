package com.epam.maven_oop;


public class Candy extends Sweet{
	
	String Name;
	int cost;
	float weight;
	int sweetness;
	
	public Candy(String Name,int cost,float weight,int sweetness) {
		super(Name,cost,weight,sweetness);
	}
	
}