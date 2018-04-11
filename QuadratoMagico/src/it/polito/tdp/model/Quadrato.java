package it.polito.tdp.model;

import java.util.*;

public class Quadrato {
	
	int n ;
	int magic ;
	List<Integer> matrice ;
	
	public Quadrato(int n) {
		this.n = n ;
		this.magic = n*(n*n +1)/2;
		this.matrice = new ArrayList<Integer>();
	}

	public Quadrato(Quadrato parziale) {
		this.n = parziale.n;
		this.magic = parziale.magic;
		this.matrice = new ArrayList<Integer>(parziale.matrice);
	}

	private boolean checkRows() {
		return false;
	}
	
	private boolean checkColumns() {
		return false;
	}
	
	private boolean checkDiagonals() {
		return false;
	}
	
	public boolean isValid() {
		// mi dice se il quadrato è una soluzione valida
		return checkRows() & checkColumns() & checkDiagonals(); //se tutti ritornano true allora ritorna true, altrimenti false
	}

	public boolean contains(int i) {
		return this.matrice.contains(i);
	}
	
	public void add(int i) {
		this.matrice.add(i);
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		this.matrice.remove(Integer.valueOf(i)); //sennò mi toglie l'elemento alla posizione iesima
	}
}
