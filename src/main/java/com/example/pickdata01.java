package com.example;


public class pickdata01 {
	
	int offset;
	int pod;
	double score;
	final double log2 =  0.30102999566;
	int beta;
	int bmin;
	
	public void offset(){
		offset = beta - bmin;
	}
	
	public void scoreCal(){
		score = offset*pod/log2;
	}
	

}
