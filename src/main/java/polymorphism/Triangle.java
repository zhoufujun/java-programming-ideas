package polymorphism;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 上午10:26:26  
 */
public class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("triangle.draw()");
	}
	
	@Override
	public void erase() {
		System.out.println("triangle.erase()");
	}
}
