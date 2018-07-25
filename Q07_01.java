package Ch07;

public class Q07_01 {
	static {
		System.out.println("1-QQ1");
	}

	Q07_01() {
		System.out.println("2-QQ2");
	}

	static {
		System.out.println("3-QQ3");
	}

	public static void main(String[] args) {

		Q07_01 con = new Q07_01();
		System.out.println("4-HaHaHa");
		System.out.println("印在console上的順序為 1 3 5 2 4");
	}

	static {
		System.out.println("5-QQ4");
	}

}
