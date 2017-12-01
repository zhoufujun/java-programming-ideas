package algorithm;
/** 
 * @author ant 
 * @date 创建时间：2017年4月14日 上午10:19:34  
 */
public class Recursion {
	
	public void printDigit(int n) {
		System.out.println(n);
	}

	public void printOut(int n) {
		if (n >= 10) {
			printOut(n/10);
		} else {
            printDigit(n % 10);
		}
	}
	
	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		recursion.printOut(76234);
	}
}
