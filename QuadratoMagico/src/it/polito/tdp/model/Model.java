package it.polito.tdp.model;

import java.util.*;

public class Model {
	
	List<Quadrato> soluzione ;
	
	public List<Quadrato> findMagicSquare(int n) {
		
		soluzione = new ArrayList<Quadrato>();
		
		int step = 0;
		Quadrato parziale = new Quadrato(n);
		recursive(step, parziale, n);
		
		return soluzione;
	}
	
	private void recursive(int step, Quadrato parziale, int n) {
		
		System.out.println(parziale);
		
		if(step >= n*n) {
			//soluzione completa
			if(parziale.isValid()) {
				//devo salvare la soluzione completa
				soluzione.add(new Quadrato(parziale)); //deep copy
			}
		}
		
		for(int i = 1; i < n*n; i++) {
			
			if(!parziale.contains(i)) {
				parziale.add(i);
				recursive(step+1, parziale, n);
				parziale.remove(i); //backtrack
			}
			
		}
	}
}
