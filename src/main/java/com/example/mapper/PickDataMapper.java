package com.example.mapper;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.example.parse.BigContestParser;

public class PickDataMapper extends Mapper<LongWritable, Text, Text, LongWritable> {

	private final static LongWritable one = new LongWritable(1);
	private Text word = new Text();
	
	@Override
	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		
		BigContestParser parser = new BigContestParser(value);
		
		String[] values = parser.toString().split(",");
		
		for(String v : values){
			word.set(v);
			context.write(word, one);
		}
		
	}
}
