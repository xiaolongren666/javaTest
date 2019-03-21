/**
 * 
 */
package dfgh;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
*@Author:小龙人
*@File Name:ggh.java
*@Created Time:2019年3月12日下午2:34:11
*@Introduce Function:TODO
*/
public class ggh extends Mapper<LongWritable, Text, Text, Text> {

	public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {

	}

}
