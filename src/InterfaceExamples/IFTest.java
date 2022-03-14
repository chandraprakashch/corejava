package InterfaceExamples;

public class IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack mystack1 = new FixedStack(8);
		FixedStack mystack2 = new FixedStack(6);
		
		//push some numbers to the stack.
		for(int i = 0; i < 8; i++) mystack1.push(i);
		for(int i = 0; i < 6; i++) mystack2.push(i);
		
		//pop these numbers off the stack
		System.out.println("Stack in mystack1 : ");
		for(int i = 0; i < 8; i++) 
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2 : ");
		for(int i = 0; i < 6; i++) 
			System.out.println(mystack2.pop());
		
	}

}
