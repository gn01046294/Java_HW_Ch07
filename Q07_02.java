package Ch07;

import java.util.Calendar;//0=1月,1=2月,2=3月,3=4月,4=5月,5=6月,6=7月,7=8月,8=9月,9=10月,10=11月,11=12月

class StaticCodeBlock {
	static String season;
	static {
		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		month = month + 1;

		if (month >= 3  && month <= 5) {
			season = "春天";
		} else if (month >= 6  && month <= 8) {
			season = "夏天";
		} else if (month >= 9  && month <= 11) {
			season = "秋天";
		} else if (month >= 12  && month <= 1) {
			season = "冬天";
		}

	}
}

public class Q07_02 {

	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);

	}

}
