package polymorphism;

import java.util.Random;

/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 上午10:29:25  
 */
public class RandomShapeGenerator {
	
	private Random random = new Random(47);
	
	public Shape next() {
		switch (random.nextInt(3)) {
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		default: return null;
		}
		
	}

}
