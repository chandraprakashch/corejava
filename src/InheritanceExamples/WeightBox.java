package InheritanceExamples;

public class WeightBox extends Box {
	
	private double weight;	
	
	WeightBox(){
		super();
		weight = -1;
	}
	
	WeightBox(double len, double w){
		super(len);
		weight = w;
	}
	
	WeightBox(WeightBox ob){
		super(ob);
		weight = ob.weight;
	}
	
	WeightBox(double width, double height, double depth, double w){
		super(width, height, depth);
		weight = w;
	}

	double weight() {
		return weight;
	}
}
