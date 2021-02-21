package entities;

public class Triangle {
		
	public double area (double xa, double xb, double xc) {
		double p = (xa+xb+xc)/2.0;
		
		return Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
	}
}
