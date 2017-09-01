/**
 * create a new class Circle 
 * @author Jiabin Wang
 * @time 9/1/2017
 */
public class Circle {
	private int radius;//radius of a Circle

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int circleArea(){
		/** get value of the area of a Circle
		 * @return transfer the value into integer 
		 */
	    return (int)(Math.PI * radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}
