package InterfaceExamples;

public class Client implements Callback, CallbackTwo{
	public void callback(int p) {
		System.out.println("Client implementation of callback interface with "+p);
	}
	
	public void callback(double a) {
		double x = a * 2;
		System.out.println("Client implemtation of callbackTwo interface with values multiplied is "+x);
	}
	
	public void nonIfaceMethod() {
		System.out.println("Called Non interface method");
	}
}
