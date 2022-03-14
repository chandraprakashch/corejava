package P2;

public class Protection2 extends P1.Protection{
	Protection2(){
		System.out.println("Derived other package constructor.");
		//class or package only
		//System.out.println("n = "+n);
		
		//class only
		//System.out.println("n_pri = "+n_pri);
		
		System.out.println("n_pub = "+n_pub);
		System.out.println("n_pro = "+n_pro);

	}
}
