package com.pickdata;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import com.pickdata.parser.BigContestParser;

public class pickTest {

	@Test
	public void test() {

		String text = "1,0,1,0,0,0,9001,9001,9001,0,1,0,2,13,3,420001,공무원,5400,7700,4,1,24,주부,0,0,0,0,0,0,0,0,0,0,12,20미만,0,0,0,0,190000,0,190000,0,190000,20000000,20000000,0,0,10,0,0,0,50,1,450,493,,30000,80000,N,800000,20111,0,0,0,0,O,U,580000";
		String[] columns = text.toString().split(",");
		System.out.println(Long.parseLong(columns[2]));
		System.out.println((long) Integer.parseInt(columns[2]));
	}

	@Test
	public void test01(){
		String text = "1,0,1,0,0,0,9001,9001,9001,0,1,0,"
				      + "2,13,3,420001,공무원,5400,7700,4,1,24,"
				      + "주부,0,0,0,0,0,0,0,0,0,0,12,20미만,0,0,"
				      + "0,0,190000,0,190000,0,190000,20000000,20000000,"
				      + "0,0,10,0,0,0,50,1,450,493,,30000,80000,N,"
				      + "800000,20111,0,0,0,0,O,U,580000";
		BigContestParser parser = new BigContestParser(text);
		
		
		Iterator<Object> iterator = parser.map.keySet().iterator();
		while(iterator.hasNext()){
			String key = (String)iterator.next();
			System.out.print("key = "+key);
			System.out.println(" value = "+parser.map.get(key));
		}
		
		
	}
}
