/**
 * 
 */
package ink.xlr.avgCombiner;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

/**
*@Author:小龙人
*@File Name:AvgWritable.java
*@Created Time:2019年3月25日下午4:05:25
*@Introduce Function:TODO
*/
public class AvgWritable implements Writable {

	int count;
	double sumScore;
	/* (non-Javadoc)
	 * @see org.apache.hadoop.io.Writable#readFields(java.io.DataInput)
	 */
	@Override
	public void readFields(DataInput arg0) throws IOException {
		count = arg0.readInt();
		sumScore = arg0.readDouble();
	}

	/* (non-Javadoc)
	 * @see org.apache.hadoop.io.Writable#write(java.io.DataOutput)
	 */
	@Override
	public void write(DataOutput arg0) throws IOException {
		arg0.writeInt(count);
		arg0.writeDouble(sumScore);
	}

}
