package InheritanceExamples;

public class InterfaceTest implements InterfaceExamples.CallbackTwo{
	
	public void callback(double c) {
		System.out.println("this is implementation of interfae from other package with "+c);
	}
}
