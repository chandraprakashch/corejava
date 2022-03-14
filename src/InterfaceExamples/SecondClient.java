package InterfaceExamples;

public class SecondClient implements Callback{
	
	public void callback(int p) {
		System.out.println("SecondClient implementation of interface with "+p);
	}
}
