package p0;


import java.math.BigDecimal;

//1901_19001_张三_技术串讲作业.rar

//Shift+Alt+j  == 加类说明
/**
 * Java的数据类型  8种最基本的数据类型
 * @author 高军
 * @date 2020-6-29
 */
public class DataType {

	public static void main(String[] args) {
		// 基本数据类型 之 整数类型包含：byte、short、int(默认)、long
//        int a=2147483647;//21亿左右
//        long b=21474836470000L;//万万亿级别
//        
//        // 基本数据类型 之 浮点数类型包含：float、double(默认)
//        float c=(10/3.0F);
//        
//        System.out.println(c);
//        double d=(10/3.0);
//        System.out.println(d);
//        //问题
//        System.out.println(0.09+0.01);//0.1
//        //解决01
//        System.out.println(0.09F+0.01F);//0.1
//        
//        //6.5=101.1  6.6=101.1001  0.6
//        //解决02
//        BigDecimal bd1 = new BigDecimal("0.09");
//        BigDecimal bd2 = new BigDecimal("0.01");
//        System.out.println("add:"+bd1.add(bd2));
		
		// 基本数据类型 之 字符类型：char
//		char e ='A';
//		System.out.println("e="+e);
//		//你好 "中国" !
//		System.out.println("你好 \"中国\"!");
        
//		char f =65;//A---Z  65---(65+26)
//		System.out.println("f="+f);
       
		
		// 基本数据类型 之 布尔类型：boolean
//		boolean g = 1>2;//true
//		System.out.println("g="+g);
		System.out.println(10 / 3);// 避免这里问题出现
		System.out.println(10 / 3.0);// 自动类型转换

		int h = (int) 5.8;// 强制取整

		System.out.println("h=" + h);
		//格式化 代码  Ctrl+Shift+f  (k)
		
	}
}
