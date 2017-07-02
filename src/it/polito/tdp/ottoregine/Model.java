package it.polito.tdp.ottoregine;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	List<Scacchiera> solutions;
	
	public List<Scacchiera> findSolutions(int dimensione){
		
		solutions = new ArrayList<Scacchiera>();
		
		int step = 0;
		Scacchiera scacchiera = new Scacchiera(dimensione);
		
		recursive(scacchiera, step);
		
		return solutions;
		
	}

	private void recursive(Scacchiera scacchiera, int step){

		// terminazione
		
		if(step==scacchiera.getDimension()){
			solutions.add(new Scacchiera(scacchiera));
			return;
		}
		
		// soluzioni parziali
		
		for(int i=0; i<scacchiera.getDimension(); i++){
			
			// controllo righe e colonne
																					// manca controlloDiagonale()
			if(!scacchiera.contains(i) && !controllaDiagonale(scacchiera, step)){
				
				scacchiera.add(i);
				
				recursive(scacchiera, step+1);
				
				scacchiera.remove(i);
				
			}
			
		}
		
	}

	private boolean controllaDiagonale(Scacchiera scacchiera, int step) {
		// TODO Auto-generated method stub
		return false;
	}

}
