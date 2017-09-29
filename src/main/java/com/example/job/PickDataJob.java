package com.example.job;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.example.mapper.PickDataMapper;
import com.example.reducer.PickDataReducer;

public class PickDataJob extends Configured implements Tool {

	public static void main(String[] args) throws Exception {
		
		int res = ToolRunner.run(new Configuration(), new PickDataJob(), args);
	}

	@Override
	public int run(String[] arg0) throws Exception {
		
		Job job = new Job(getConf(), "PickData");
		
		FileInputFormat.addInputPath(job, new Path(""));
		FileOutputFormat.setOutputPath(job, new Path(""));
		
		job.setJarByClass(PickDataJob.class);
		
		job.setMapperClass(PickDataMapper.class);
		job.setReducerClass(PickDataReducer.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);
		
		job.waitForCompletion(true);
		
		return 0;
	}

}
