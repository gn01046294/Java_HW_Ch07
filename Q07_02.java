package Ch07;

import java.util.Calendar;//0=1る,1=2る,2=3る,3=4る,4=5る,5=6る,6=7る,7=8る,8=9る,9=10る,10=11る,11=12る

class StaticCodeBlock {
	static String season;
	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		month = month + 1;

		if (month >= 3  && month <= 5) {
			season = "�Kぱ";
		} else if (month >= 6  && month <= 8) {
			season = "�Lぱ";
		} else if (month >= 9  && month <= 11) {
			season = "�遒�";
		} else if (month >= 12  && month <= 1) {
			season = "�Vぱ";
		}

	}
}

public class Q07_02 {

	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);

	}

}
