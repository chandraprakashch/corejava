package InheritanceExamples;

public class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(Box b){
		width = b.width;
		height = b.height;
		depth = b.depth;
	}
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	Box(){
		width = height = depth = -1;
	}
	
	Box(double len){
		width = len;
		height = len;
		depth = len;
	}
	
	double volume() {
		return width*height*depth;
	}
	
	double w() {return width;}
	double h() {return height;}
	double d() {return depth;}	
}
