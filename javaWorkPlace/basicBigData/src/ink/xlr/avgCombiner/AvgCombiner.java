/**
 * 
 */
package ink.xlr.avgCombiner;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
*@Author:小龙人
*@File Name:AvgCombiner.java
*@Created Time:2019年3月25日下午4:26:20
*@Introduce Function:TODO
*/
public class AvgCombiner extends Reducer<Text, AvgWritable, Text, AvgWritable> {

	private static AvgWritable avg = new AvgWritable();
	public void reduce(Text _key, Iterable<AvgWritable> values, Context context) throws IOException, InterruptedException {
		// process values
		for (AvgWritable val : values) {
			avg.count += val.count;
			avg.sumScore += val.sumScore;
		}
		context.write(_key, avg);
	}

}
