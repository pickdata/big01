package com.example.parse;

import org.apache.hadoop.io.Text;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PickDataParser {

//	ID	Y	C5	C6	C7	I1	I2	I3	age	sex	T15
	
	private Integer id;
	private Integer target;
	private Integer c5;
	private Integer c6;
	private Integer c7;
	private String i1;
	private Integer i2;
	private Integer i3;
	private Integer age;
	private Integer sex;
	private Integer t15;
	
	public PickDataParser(Text text){
		try{
			String[] colums = text.toString().split(",");
			
			id=Integer.parseInt(colums[0]);
			target = Integer.parseInt(colums[1]);
			c5 = Integer.parseInt(colums[2]);
			c6 = Integer.parseInt(colums[3]);
			c7 = Integer.parseInt(colums[4]);
			i1 = colums[5];
			i2 = Integer.parseInt(colums[6]);
			i3 = Integer.parseInt(colums[7]);
			age = Integer.parseInt(colums[8]);
			sex = Integer.parseInt(colums[9]);
			t15 = Integer.parseInt(colums[10]);
			
		}catch(Exception e){
			System.out.println("Error parsing a record: "+ e.getMessage());
		}
	}
}
