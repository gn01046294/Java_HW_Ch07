package Ch07;

import java.util.Calendar;//0=1��,1=2��,2=3��,3=4��,4=5��,5=6��,6=7��,7=8��,8=9��,9=10��,10=11��,11=12��

class StaticCodeBlock {
	static String season;
	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		month = month + 1;

		if (month >= 3  && month <= 5) {
			season = "�K��";
		} else if (month >= 6  && month <= 8) {
			season = "�L��";
		} else if (month >= 9  && month <= 11) {
			season = "���";
		} else if (month >= 12  && month <= 1) {
			season = "�V��";
		}

	}
}

public class Q07_02 {

	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);

	}

}
