package polymorphism;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 上午10:19:56  
 */
public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("circle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("circle.erase()");
	}
	
	@Override
	public void print() {
		System.out.println("circle.print()");
	}
}
