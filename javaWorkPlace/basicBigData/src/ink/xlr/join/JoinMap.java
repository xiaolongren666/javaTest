/**
 * 
 */
package ink.xlr.join;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * @Author:小龙人
 * @File Name:JoinMap.java
 * @Created Time:2019年3月25日下午3:06:07
 * @Introduce Function:TODO
 */
public class JoinMap extends Mapper<LongWritable, Text, Text, Text> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {
		String[] str = ivalue.toString().split(" ");
		if(str.length == 2) {
			// 订单标签O_
			context.write(new Text(str[0]), new Text("0_" + str[0] + "," + str[1]));
		}else if (str.length == 3) {
			// 订单详细标签 I_
			context.write(new Text(str[0]), new Text("I_" + str[0] + "," + str[1]));
		}
	}

}
