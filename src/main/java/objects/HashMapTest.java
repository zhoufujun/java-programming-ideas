package objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/** 
 * @author ant 
 * @date 创建时间：2017年10月16日 上午10:18:35  
 */
public class HashMapTest {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Date date = new Date(System.currentTimeMillis() - 2*60*60*1000);
		System.out.println(date);
		//System.out.println(hash("zhou"));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	}
	
	public static int hash(Object k) {
        int h = 0;
        if (0 != h && k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }

        h ^= k.hashCode();
        System.out.println("h2:"+h);

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

}
