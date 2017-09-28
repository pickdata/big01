package com.example;


public class pickdata01 {
	
	int min;
	int pod;
	double score;
	final double log2 =  0.30102999566;
	
	public void scoreCal(){
		score = min*pod/log2;
	}

}
