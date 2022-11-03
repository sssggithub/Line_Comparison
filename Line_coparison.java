package problem;

public class Line_coparison {
public void calculate(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
	double length=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	System.out.println("Length of line is:"+length);
	double length1=Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3)));
	System.out.println("Length of line is:"+length1);
	if (length==length1) {
		System.out.println("Two Length are Equal");
	}
	else {
		System.out.println("Two Length are not Equal");
	}
		
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		Line_coparison l=new Line_coparison();
		l.calculate(3, 6, 4, 8,3,6,4,8);
		
	}

}
