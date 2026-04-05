package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Hardcode {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip! \n");
		Comment c2 = new Comment("Wow that's awesome! \n");

		Post p1 = new Post(sdf.parse("20/06/2018 13:05:44"), "Traveling to New Zealend",
				"I'm going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

		sc.close();
	}
}
