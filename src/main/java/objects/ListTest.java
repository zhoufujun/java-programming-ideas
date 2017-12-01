package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/** 
 * @author ant 
 * @date 创建时间：2017年4月18日 上午11:33:31  
 */
public class ListTest {
	
	
	public void listTest(List<User> list) {
		long start = System.currentTimeMillis();
	    for (int i = 0; i < 100000; i++) {
			list.add(new User(1,"fff","ss",1));
		}
	    long end = System.currentTimeMillis();
	    System.out.println(list.getClass()+":"+(end - start));
	}
	
	public static int [] insertionSort(int [] test) {
		for (int i = 1; i < test.length; i++) {
			int key = test[i],j = i - 1;
		    while (j >= 0 && test[j] > key) {
				test[j+1] = test[j];
				j--;
			}
		    test[j+1] = key;
		}
		return test;		
	}
	
	public static void main(String[] args) {
//		int [] test = {5,2,1,9,3,6,4,8,7};
//		int [] sort = insertionSort(test);
//		for (int i : sort) {
//			System.out.print(i+"\t");
//		}	
//		User user = new User(1, "fs", "", 12);
//		int hashcode = user.hashCode();
//		System.out.println(hashcode);
		String string= "周";
		int value = Integer.parseInt(string);
		System.out.println(":::"+value);
		int hashVal = 0;
		float f =  1.0F;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		final Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		List<Integer> sIntegers = new ArrayList<Integer>();
		map.put("ff", 1);
		for (int i = 0; i < string.length(); i++) {
			hashVal += string.charAt(i);
		}
		System.out.println(hashVal);
		
	}

}
