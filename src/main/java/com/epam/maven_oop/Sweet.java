package com.epam.maven_oop;

import java.util.*;

class sortByCost implements Comparator<Sweet>{
	public int compare(Sweet s1,Sweet s2) {
		return s1.cost-s2.cost;
	}
}

class sortByWeight implements Comparator<Sweet>{
	public int compare(Sweet s1,Sweet s2) {
		return Float.compare(s1.weight,s2.weight);
	}
}

class sortBySweetness implements Comparator<Sweet>{
	public int compare(Sweet s1,Sweet s2) {
		return s1.sweetness-s2.sweetness;
	}
}

public  class Sweet {
	
	String Name;
	int cost;
	float weight;
	int sweetness;
	
	public Sweet(String Name,int cost,float weight,int sweetness) {
		this.Name=Name;
		this.cost=cost;
		this.weight=weight;
		this.sweetness=sweetness;
	}
	
}