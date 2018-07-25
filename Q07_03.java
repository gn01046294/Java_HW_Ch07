package Ch07;

abstract class  Human{
	
int weight = 50;	
 abstract void smile() ;              //System.out.println("HA")
}


 class OrdinaryPeople extends Human{

	@Override
	void smile() {
		System.out.println("HA");
		
	}
}
 class HappyMary extends OrdinaryPeople{
	
} 

public class Q07_03 {

	public static void main(String[] args) {
		HappyMary hm = new HappyMary();
		hm.smile();
	}
}
