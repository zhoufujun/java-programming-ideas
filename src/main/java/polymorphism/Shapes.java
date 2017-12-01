package polymorphism;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 上午10:36:53  
 */
public class Shapes {
	
	private static RandomShapeGenerator rsg = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		Shape [] shapes = new Shape [9];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = rsg.next();
		}
		for (Shape shape : shapes) {
			shape.print();;
		}
	}

}
