/**
 * 
 */
package entities;

/**
 * 
 */
public class Triangle {
 public double a;
 public double b;
 public double c;
 
 public double area() {
	
	 
	double raio = (a + b +c)/2;
	double area = Math.sqrt(raio *(raio - a) *(raio- b) * (raio-c));
	return  area; // ou poderia usar return em cima logo
 }
}
