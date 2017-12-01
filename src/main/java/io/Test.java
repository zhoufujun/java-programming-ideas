package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/** 
 * @author ant 
 * @date 创建时间：2017年11月24日 上午9:20:30  
 */
public class Test {
	
	public void change(String str,char[] cs) {
		str = "test ok";
		cs[0] = 'g';
	}
	
	public static void main(String[] args)  {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		arrayList.ensureCapacity(11);
		System.out.println(arrayList.size());
	}

}
