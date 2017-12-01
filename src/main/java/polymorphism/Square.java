package polymorphism;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 上午10:23:24  
 */
public class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("square.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("square.erase()");
	}
}
