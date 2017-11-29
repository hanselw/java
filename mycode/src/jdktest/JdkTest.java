/**
 * @author wanghansong
 * No:
 * Details:
 * 2017-11-24обнГ05:39:04
 */
package jdktest;

import java.util.HashMap;
import java.util.Map;

public class JdkTest {

	/**
	 * wanghansong
	 * 2017-11-24обнГ05:39:04
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testMap();
		testDataType();
	}

	public static void testMap(){
		Map<String, String> d = new HashMap<String, String>();
		for(int i = 100; i < 200; i++){
			d.put(i+"", i+"");
		}
		System.out.println(d.size());
	}
	
	public static void testDataType(){
		System.out.println(Math.abs(-2147483648));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.pow(2, 31));
	}
}
