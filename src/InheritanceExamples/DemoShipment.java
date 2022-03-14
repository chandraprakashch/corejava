package InheritanceExamples;

public class DemoShipment {
	public static void main(String args[]) {
		
		double vol;
		Shipment ship1 = new Shipment(10,20,14,10,3.2);
		Shipment ship2 = new Shipment(4,10,4,20,5.2);
		
		vol = ship1.volume();
		System.out.println("Box Weight "+ship1.weight());
		System.out.println("Box volume "+vol);
		System.out.println("Shipment Cost Rs."+ship1.cost);
		System.out.println();
		
		vol = ship2.volume();
		System.out.println("Box Weight "+ship2.weight());
		System.out.println("Box volume "+vol);
		System.out.println("Shipment Cost Rs."+ship2.cost);
	
	}
}
