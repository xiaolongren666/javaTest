/**
 * 
 */
package ink.xlr.wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

/**
*@Author:小龙人
*@File Name:WordCountDriver.java
*@Created Time:2019年3月22日上午9:28:41
*@Introduce Function:TODO
*/
public class WordCountDriver {

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
		if(otherArgs.length < 2) {
			System.out.println("Usage: wordcount <in>[<in>....]<out>");
			System.exit(2);
		}
		
		Job job = Job.getInstance(conf, "WordCount");
		job.setJarByClass(ink.xlr.wordcount.WordCountDriver.class);
		// TODO: specify a mapper
		job.setMapperClass(WordCountMap.class);
		// TODO: specify a reducer
		job.setReducerClass(WordCountReduce.class);

		// MAP端输出类型
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		// TODO: specify output types
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(LongWritable.class);

		// TODO: specify input and output DIRECTORIES (not files)
		FileInputFormat.setInputPaths(job, new Path("src"));
		FileOutputFormat.setOutputPath(job, new Path("out"));
 
		// 指定Job的输出路径
		for (int i = 0; i < otherArgs.length - 1; i++) {
			FileInputFormat.addInputPath(job, new Path(otherArgs[i]));
		}
		// 指定Job的输出路径
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[otherArgs.length - 1]));
		
		if (!job.waitForCompletion(true))
			return;
	}

}
