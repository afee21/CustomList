package com.naztech.CustomList;

@SuppressWarnings("unchecked")
public class CustomList<T>{
	private Object[] customlist; 
	private int start;
	private int Capacity = 10;
	
	CustomList(){
		customlist = new Object[Capacity];
		start = -1;
	}
	
	private boolean isAvailable(int k) {
		if(customlist[k] != null)
			return true;
		return false;
	}
	
	public void add(T obj) {
		customlist[++start] = obj;
	}
	
	public boolean addAt(int i, T obj) {
		int index = ++start;
		while(index>=i) {
			customlist[index+1] = customlist[index];
			index--;
		}
		customlist[i] = obj;
		return true;
	}
	
	
	public boolean remove(T obj) {
		for(int j = 0; j <= start; j++)
		{
			if(obj.equals( (T)customlist[j]) ) {
				return removeAt(j);
			}
		}
		return false;
	}
	
	public boolean removeAt(int j) {
		if(isAvailable(j)) {
			while(j<this.start) {
				customlist[j]=customlist[j+1];
				j++;
			}
			customlist[start] = null;
			this.start--;
			return true;
		}
		return false;
	}
	
	public T get(int j) {
		return (T)customlist[j];
	}
	
	public int size() {
		return this.start+1;
	}

	@Override
	public boolean equals(Object o) {
		CustomList<T> customList = (CustomList<T>) o;
		if(this.size() == customList.size()) {
			for(int k = 0; k < this.size(); k++) {
				if(!customList.get(k).equals(this.get(k)))
					return false;
			}
			
			return true;
		}
		return false;

	}
	
	
	
}
