/**
 * 
 */
package ink.xlr.wordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
*@Author:小龙人
*@File Name:WordCountMap.java
*@Created Time:2019年3月22日上午9:20:40
*@Introduce Function:TODO
*/
public class WordCountMap extends Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		String[] str = ivalue.toString().split(" ");
		for (String string : str) {
			context.write(new Text(string), new IntWritable(1));
		}
	}

}
