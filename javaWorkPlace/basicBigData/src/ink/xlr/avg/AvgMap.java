/**
 * 
 */
package ink.xlr.avg;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
*@Author:小龙人
*@File Name:AvgMap.java
*@Created Time:2019年3月25日下午3:46:00
*@Introduce Function:TODO
*/
public class AvgMap extends Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		String[] str = ivalue.toString().split(" ");
		context.write(new Text(str[1]), new IntWritable(Integer.parseInt(str[2])));
	}

}
