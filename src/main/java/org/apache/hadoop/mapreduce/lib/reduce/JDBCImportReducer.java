package org.apache.hadoop.mapreduce.lib.reduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class JDBCImportReducer extends Reducer<LongWritable, Text, NullWritable, Text> {

    @Override
    public void setup(Context context) {}

    @Override
    public void reduce(LongWritable key, Iterable<Text> values, Context context) {}

    @Override
    public void cleanup(Context context) {}

}
