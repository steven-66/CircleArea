import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle: ");
		int r = sc.nextInt();//input a integer r by user
		System.out.println("Area of a circle is: ");
		Circle c= new Circle();//create a new Circle c
		c.setRadius(r);//assign r for Circle c as radius
		System.out.print(c.circleArea());//output the area of Circle c 
	}

}
