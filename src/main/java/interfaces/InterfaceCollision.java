package interfaces;
/** 
 * @author ant 
 * @date 创建时间：2017年4月12日 下午3:21:23  
 */
public class InterfaceCollision {

	public static void main(String[] args) {
		C3 c3 = new C3();
		System.out.println(c3.f(1));
	}

}

interface I1 {
	void f();
}

interface I2 {
	int f(int i);
}

interface I3 {
	int f();
}

class C {
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	public void f() {
	}

	public int f(int i) {
		return 1;
	} // overloaded
}

class C3 extends C implements I2 {

	public int f(int i) {
		return 1;
	}
	 // overloaded
}

class C4 extends C implements I3 {
	public int f() {
		return 1;
	}
}

