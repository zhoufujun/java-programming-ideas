package initialization;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author ant 
 * @date 创建时间：2017年7月21日 下午2:19:33  
 */
public class StaticInitialization {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	}	

}

class StaticObject{
	
	public StaticObject(int num) {
		System.out.println("StaticObject("+num+")");
	}
	
	public void testFunction(int num) {
		System.out.println("testFunction("+num+")");
	}
}