package innerClasses;
/** 
 * @author ant 
 * @date 创建时间：2017年4月13日 上午10:51:39  
 */
class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		System.out.println(c.value());
		System.out.println(d.readLabel());
	}
}
