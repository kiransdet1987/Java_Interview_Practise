package com.in28minutes.GenericsDemo;

import java.util.ArrayList;

public class MyCustomList <T>{

	ArrayList<T> list = new ArrayList<T>();
	
	public void addElement(T element) {
		list.add(element);
	}
	
	
	public void removeElement(T element) {
		list.remove(element);
	}


	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}


	public T get(int index) {
		return list.get(index);
	}
	
	
	

}
