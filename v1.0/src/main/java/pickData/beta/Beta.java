package pickData.beta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Beta {
	public static void main(String[] args) {
		Map<String, Double> mapt13 = new HashMap<String, Double>();
		
		mapt13.put("bx", 0.0);
		mapt13.put("bo", -0.9493);
		mapt13.put("bk", -1.3525);
		mapt13.put("bg", 0.8241);
		mapt13.put("br", 0.0);
		
		Map<String, Double> mapc11 = new HashMap<String, Double>();
		Double[] betac11 = new Double[] {
				1.8613,
				0.6827,
				0.1108,
				-0.4673,
				-0.752,
				-1.0232,
				-1.2449,
				-2.5241,
				-1.2892,
				-1.3312,
				-1.5922,
				0.0
	
		};
		for (int i=0; i<betac11.length; i++) {
			String key = "b" + i;
			Double value = betac11[i];
			mapc11.put(key, value);
		}
		
		for (Map.Entry<String, Double> elem : mapc11.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}
		
		
		
//		mapc11.put("b0", 1.8613);
//		mapc11.put("b0", 0.1108);
//		mapc11.put("b0", -0.4673);
//		mapc11.put("b0", -0.752);
//		mapc11.put("b0", -1.0232);
//		mapc11.put("b0", -1.2449);
//		mapc11.put("b0", 0.0);
//		mapc11.put("b0", 0.0);
//		mapc11.put("b0", 0.0);
//		mapc11.put("b0", 0.0);
//		mapc11.put("b0", 0.0);
//		mapc11.put("b0", 0.0);
//		
//		
//		0.6827
//		
//		
//		
//		
//		
//		-2.5241
//		-1.2892
//		-1.3312
//		-1.5922
//		0

		

	}
}
