package com.lprates.concurrency.smokersclub.main;

import com.lprates.concurrency.smokersclub.elements.Elements;
import com.lprates.concurrency.smokersclub.monitor.SmokersClubMonitor;
import com.lprates.concurrency.smokersclub.smoker.Smoker;

public class SmokersClubMain {
	
	public static void main(String [] args){
		
		int nSmokers = 10;
		
		Elements elements = new Elements();
		SmokersClubMonitor smokersClubMonitor = new SmokersClubMonitor(elements);
		
		Smoker[] smokers = new Smoker[nSmokers];
		
		
		for (Smoker smoker: smokers){
			smoker = new Smoker("Dummy",smokersClubMonitor,elements);
		}
		
		
		Thread[] smokersThread = new Thread[nSmokers];
		
		for ( int i=0 ; i <nSmokers ; i++){
			
		}
		
		
	}

}
