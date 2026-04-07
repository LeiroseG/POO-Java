package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Shapes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER NUMBER OF SHAPES");
		List<Shape> list = new ArrayList<>();
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + "data: \n" + "Rectangle or Circle(r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("COLO ( BLACK / BLUE/ RED ");
			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {
				System.out.print(" Widht? ");
				double width = sc.nextDouble();
				System.out.print(" Height? ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color,width,height));

			}else {
				System.out.print(" radius? ");
				double radius = sc.nextDouble();
				list.add(new Circle(color,radius));
			}
		}
		
		System.out.println("SHAPE AREAS : ");
		
		for(Shape sh : list) {
			
			
			System.out.println(String.format("%.2f", sh.area()));
					
		}
		
		sc.close();

	}

}
