package InterfaceExamples;

public class TestIface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callback c  = new Client();
		CallbackTwo d = new Client(); 
		c.callback(42);
		d.callback(12);
		
		//System.out.println("value of nonIface is "+c.nonIfaceMethod());
		c = new SecondClient();
		c.callback(53);
		Client cl = new Client();
		
		//to call noninterface method you need the class ref and obj interface ref will not work.
		cl.nonIfaceMethod();
	}

}
