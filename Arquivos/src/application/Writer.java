package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon","Good night"};
	
		String path = "E:\\Projetos Eclipse\\out.txt";
		//se eu colocar (path,true) ele adiciona texto depois do fim do arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
		{
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
