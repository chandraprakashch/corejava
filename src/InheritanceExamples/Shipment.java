package InheritanceExamples;

public class Shipment extends WeightBox {
	double cost;
	
	Shipment(Shipment ob){
		super(ob);
		cost = ob.cost;
	}
	
	Shipment(double w, double h, double d, double wt, double c){
		super(w,h,d,wt);
		cost = c;
	}
	
	Shipment(double len, double weight, double c){
		super(len, weight);
		cost = c;
	}
	
	Shipment(){
		super();
		cost = -1;
	}
}
