/**
 * 
 */
package ink.xlr.avgCombiner;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
*@Author:小龙人
*@File Name:AvgCombinerMap.java
*@Created Time:2019年3月25日下午3:59:46
*@Introduce Function:TODO
*/
public class AvgCombinerMap extends Mapper<LongWritable, Text, Text, AvgWritable> {

	AvgWritable avg = new AvgWritable();
	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		String[] str = ivalue.toString().split(" ");
		avg.count = 1;
		avg.sumScore = Float.parseFloat(str[2]);
		context.write(new Text(str[1]), avg);
	}

}
