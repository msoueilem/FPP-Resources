package prog7_2_startup;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	int readBottom() {
		mid = new Middle();
		midbot = mid.new Bottom();
		return midbot.b;
	}
	class Middle {
		int m = 2;
		int addTopAndBottom() {
			Bottom bottom = new Bottom();
			return t+bottom.b;
		}
		class Bottom {
			int b = 3;
			int multiplyAllThree() {
				return t*m*b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}