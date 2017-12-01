package algorithm;
/** 
 * @author ant 
 * @date 创建时间：2017年4月14日 下午2:35:03  
 */
public class GenericMemoryCell<T> {

	private T t;
	
	public void write(T t) {
		this.t = t;
	}
	
	public T read() {
		return t;
	}
}
