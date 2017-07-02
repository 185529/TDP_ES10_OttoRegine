package it.polito.tdp.ottoregine;

import java.util.ArrayList;
import java.util.List;

public class Scacchiera {
	
	private final int dimensione;
	private List<Integer> griglia;
	
	public Scacchiera(int dimensione){
		this.griglia = new ArrayList<Integer>();
		this.dimensione = dimensione;
	}

	public Scacchiera(Scacchiera scacchiera) {
		// TODO Auto-generated constructor stub
		this.griglia = new ArrayList<Integer>(scacchiera.getGriglia());
		this.dimensione = scacchiera.getDimension();
	}

	private List<Integer> getGriglia() {
		// TODO Auto-generated method stub
		return griglia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return griglia.toString();
	}

	public int getDimension() {
		// TODO Auto-generated method stub
		return dimensione;
	}

	public void add(int i) {
		// TODO Auto-generated method stub
		griglia.add(i);
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		griglia.remove(Integer.valueOf(i));
	}

	public boolean contains(int i) {
		// TODO Auto-generated method stub
		return griglia.contains(i);
	}
	
}
