package algorithm;
/** 
 * @author ant 
 * @date 创建时间：2017年4月14日 上午11:04:27  
 */
public class Test {
	
	public <T extends Comparable<? super T>> void findMax() {
		
	}
	
	public static void main(String[] args) {
//		Person [] arr = new Teacher [9];
//		arr[1] = new Student();
//		System.out.println(arr[1]);
		
		GenericMemoryCell<Integer> cell1 = new GenericMemoryCell<Integer>();
		cell1.write(5);
		Object cell = cell1;
		GenericMemoryCell<String> cell2 = (GenericMemoryCell<String>) cell;
		String string = cell2.read();
	}

}
