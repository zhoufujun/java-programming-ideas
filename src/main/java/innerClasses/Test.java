package innerClasses;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 下午5:22:31  
 */
public class Test {
	
	public void print() {
		System.out.println("aaa");
	}

	public static class Inner{
		
		public void print() {
			System.out.println("bbb");
		}
	}
	
	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.print();
	}
}
