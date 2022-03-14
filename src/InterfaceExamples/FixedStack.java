package InterfaceExamples;

public class FixedStack implements IntStack {

	private int stck[];
	private int tos;
	
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if(tos == stck.length-1)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(tos <0) {
			System.out.println("Stack underflow");
			return 0;
		}else {
			return stck[tos--];
		}
		
	}

}
