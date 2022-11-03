package problem;

public class Line_coparison {
public void calculate(int x1,int y1,int x2,int y2) {
	double length=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	System.out.println("Length of line is:"+length);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		Line_coparison l=new Line_coparison();
		l.calculate(3, 6, 4, 8);
		
	}

}
