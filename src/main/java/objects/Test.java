package objects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.org.apache.bcel.internal.generic.DADD;

import java.util.Random;
import java.util.Set;

/**
 * @author ant
 * @date 创建时间：2017年4月17日 下午2:23:19
 */
public class Test implements Serializable {
	
	private static final long serialVersionUID = -3459157467262208191L;

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}
	
	public static int[] test2(int [] a,int [] b) {
		int [] c = new int [a.length - b.length];
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			boolean exist = true;
			for (int j = 0; j < b.length; j++) {
					if (a[i] != b[j]) {
						exist = true;
					}else {
						exist = false;
						break;
					}
			}
			if (exist) {
				c[n++] = a[i];
			}
		}		
		return c;	
	}
	
	public static int []  test(int [] a,int [] b) {
		int [] c = new int [a.length - b.length];
		int [] d = new int [a.length + b.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			d[i] = a[i];
		}
		for (int i = 0,length = a.length; i < b.length; i++) {
			d[length+i] = b[i];
		}
		for (int i = 0; i < d.length; i++) {
			if (map.get(d[i]) != null) {
				map.put(d[i], map.get(d[i])+1);
			}else {
				map.put(d[i],1);
			}
		}
		Set<Integer> integers = map.keySet();
		for (Integer integer : integers) {
			if (map.get(integer) == 1) {
				c[n++] = integer;
			}
		}		
		return c;	
	}
	
	
	
	public static String LetterCapitalize(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
		String [] strings = str.split(" ");
		for (String string : strings) {
			string.replace(string.charAt(0), (char) (string.charAt(0)-32));
		}
		String newstring = "";
	     for (String string : strings) {
			newstring += string;
		}  
	     str = newstring;
	    return str;
	    
	  } 
	
	public static int[] sort(List<int []> array) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			int [] sort = array.get(i);
			
		}
		return null;		
	}
	
	/**
	 * @Description: 随机播放 
	 * @param music
	 * @return List<String>
	 */
	public static List<String> randomSort(List<String> music) {
		//随机播放的音乐
		List<String> sortMusic = new ArrayList<String>();
		//随机音乐的下标
		List<Integer> index = new ArrayList<Integer>();
		//对原音乐列表的下标进行随机化
		while (index.size() < music.size()) {
			Random random = new Random();
			int num = random.nextInt(music.size());
			if (!index.contains(num)) {
				index.add(num);
			}
		}
		for (Integer integer : index) {
			sortMusic.add(music.get(integer));
		}
		return sortMusic;		
	}

	public static List<String> getString() {
		List<String> music = new ArrayList<String>();
		for (int i = 1; i <= 10; i++) {
			music.add("歌曲名"+i);
		}
		return music;
	}
	
	public static int[] getAll() {
		int [] total = new int[1000000];
		for (int i = 0; i < total.length; i++) {
			total[i] = i+1;
		}
		return total;
	}
	
	public static int[] getEven() {
		int [] even = new int[500000];
		for (int i = 0; i < even.length; i++) {
			even[i] = i+1;
					
		}
		return even;
	}
	
	public static void main(String args[])  {
          String a = "hello2";
          final String b = "hello";
          String c = b + 2;
          String d = "hello";
          String e = d + 2;
          System.out.println(a == c);
          System.out.println(a == e);
	}
	
	public static  <K, V> String name(Map<K, V> map) {
		
		return "";
		
	}
	
}
