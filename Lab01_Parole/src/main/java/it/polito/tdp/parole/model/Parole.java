package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	
	List<String> parole = new ArrayList<>();
	
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco() {
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	public void sort() {
		parole.sort( (s1, s2) -> s1.compareTo(s2));
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(String s : parole) {
			sb.append(s + "\n");
		}
		return sb.toString();
	}
	
	
	
}
