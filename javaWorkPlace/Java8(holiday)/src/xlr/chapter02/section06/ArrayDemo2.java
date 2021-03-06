/**
 * 
 */
package xlr.chapter02.section06;

/*
*@Author:小龙人
*@File Name:ArrayDemo2.java
*@Created Time:下午10:11:24
*@Introduce Function:二维数组
*/
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[][] a = {{1, 2}, {2, 3, 4}, {2, 3, 4, 5}};
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].length);
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[j][i]);
			}
		}
		
		// 动态初始化
		int[][] b = new int[3][4];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
		int[][] c = new int[3][];
		c[0] = new int[3];
		c[1] = new int[4];
		c[2] = new int[5];
	}
}
