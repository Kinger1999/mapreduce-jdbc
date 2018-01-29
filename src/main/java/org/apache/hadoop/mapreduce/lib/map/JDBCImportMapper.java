package org.apache.hadoop.mapreduce.lib.map;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class JDBCImportMapper extends Mapper<LongWritable, Text, LongWritable, Text> {

    @Override
    public void setup(Context context) {}

    @Override
    public void map(LongWritable key, Text value, Context context) {}

    @Override
    public void cleanup(Context context) {}


}
