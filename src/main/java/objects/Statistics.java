package objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** 
 * @author ant 
 * @date 创建时间：2017年4月13日 下午4:06:32  
 */
public class Statistics {
	
	public static void main(String[] args) {
		Random random = new Random(47);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 1000; i++) {
			Integer r = random.nextInt(30)-15;
			list.add(r);
		}
		for (Integer integer : list) {
			System.out.print(integer+"\t");
		}
		
	}

}
