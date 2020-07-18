package p0;

import java.util.Arrays;

/**
 * Java的数组范例
 * @author 高军
 * @date 2020-6-29
 */
public class Demo_Arr {

	public static void main(String[] args) {
		/*
		定义：数组是存储同一种数据类型数据的集合容器。
		      数组的定义格式：数据类型[]  变量名 = new 数据类型[长度];
		      int[] arr = new int[50];
		      分析数组:
		      左边： int[] arr  声明了一个int类型的数组变量，变量名为arr。
		             int: 表示该数组容器只能存储int类型的数据。
		             []:  这是一个一维数组类型。
		             arr: 变量名。
		      右边： new int[50]　创建了一个长度为50的int类型数组对象。
		             new: 创建数组对象的关键字。
		             int: 表示该数组对象只能存储int类型数据。
		             []:  表示是数组类型。
		             50:  该数组最多能存储50个数据。数组的容量。

		　　数组的好处：对分配到数组对象中的每一个数据都能够分配到一个索引值（编号、角标、下标）,
		                索引值的范围是从0开始，最大是: 长度-1。
		*/
//		int[] a= new int[5];//动态初始化
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		System.out.println("数组的长度="+a.length); 
//		for(int i=0;i<a.length;i++) {
//			System.out.println("a["+i+"]="+a[i]);
//		}
//		System.out.println(a[5]);
		
		/*
		数组中常见的问题：
		  1. NullPointerException 空指针异常
		     原因： 引用类型变量没有指向任何对象，而访问了对象的属性或者是调用了对象的方法。

		  2. ArrayIndexOutOfBoundsException 索引值越界。
		     原因：访问了不存在的索引值。
		*/
//		int[] b=null;
//		System.out.println("数组的长度="+b.length); 
		
		/*
		数组的 静态初始化：
		  数据类型[] 变量名 = {元素1，元素2.....}；
		  如果程序一开始你就已经确定了数据，那么这时候建议使用静态初始化。
		  如果一开始数据还不太明确，这时候就建议使用动态初始化。
		*/
		//int[] a = {2,4,6,8,10};
//		for(int i=0;i<a.length;i++) {
//		   System.out.println("a["+i+"]="+a[i]);
//     	}
		
//		//用foreach循环访问数组
//		for(int i: a) {
//			System.out.print(i+" ");
//	    }
		
		/*
		二维数组的初始化方式：
		  静态初始化：数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}；
		　动态初始化：数据类型[][] 变量名 = new 数据类型[长度1][长度2]；
		*/
		
//		int[][] arr = new int[3][4];
//		for (int i = 0; i < arr.length; i++) { // 行
//			for (int j = 0; j < arr[i].length; j++) { // 列
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int[] a = { 12, 4, 66, 8, 10 };
		int[] b = { 0, 0, 0, 0, 0 };
		// 数组复制
		System.arraycopy(a, 3, b, 1, 2);
		
//		//用foreach循环访问数组
//		for(int i: b) {
//			System.out.print(i+" ");
//	    }
		
		
		Arrays.sort(a);
		for(int i: a) {
			System.out.print(i+" ");
			
			
	    }
		

	}

}
