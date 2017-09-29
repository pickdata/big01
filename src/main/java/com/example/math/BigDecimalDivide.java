package com.example.math;

import java.util.ArrayList;
import java.util.List;

public class BigDecimalDivide {

	   // score
	   private long score;
	   Double aaa;
	   // Y Target

	   public void c1Cal() {
	      int y1[] = { 2489, 1391, 329, 66, 8, 4 };
	      int y0[] = { 30741, 51064, 11920, 1916, 261, 44 };

	      List<Integer> c1List = new ArrayList<Integer>();
	      c1List.add(0, 33230); 
	      c1List.add(1, 52455);
	      c1List.add(2, 12249);
	      c1List.add(3, 1982);
	      c1List.add(4, 269);
	      c1List.add(5, 48);
	      double a;
	      
	      BigDecimalDivide a1 = new BigDecimal(String.valueOf(2489));
	     
	      for (int i = 0; i < c1List.size(); i++) {
	         a = per(y1[i], c1List.get(i));
	         // a= per(y1[i], c1List.indexOf(i));
	         System.out.println(a);
	         System.out.println(c1List.get(i));
	      }

	   }

	   public double per(int y, double n) {
	      if (n != 0) {

	         return y / n;
	      } else {
	         return 9999.99;
	      }
	   }


	

}
