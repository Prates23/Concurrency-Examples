package com.lprates.concurrency.smokersclub.elements;

public class Elements {

	private int nLighters;
	private int nPapers;
	private int nTobacco;

	public int getnLighters() {
		return nLighters;
	}

	public void setnLighters(int nLighters) {
		this.nLighters = nLighters;
	}

	public int getnPapers() {
		return nPapers;
	}

	public void setnPapers(int nPapers) {
		this.nPapers = nPapers;
	}

	public int getnTobacco() {
		return nTobacco;
	}

	public void setnTobacco(int nTobacco) {
		this.nTobacco = nTobacco;
	}

	public void increaseTobacco() {
		this.nTobacco++;
	}

	public void increasePapers() {
		this.nPapers++;
	}

	public void increaseLighters() {
		this.nLighters++;
	}
	
	public void deacreaseTobacco() {
		this.nTobacco--;
	}

	public void deacreasePapers() {
		this.nPapers--;
	}

	public void decreaseLighters() {
		this.nLighters--;
	}

}
