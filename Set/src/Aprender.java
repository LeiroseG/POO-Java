import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aprender{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int quantityA = sc.nextInt();
        Set<Integer> cursoA = new HashSet<>();
        for (int i = 0; i < quantityA; i++) {
            int studentCode = sc.nextInt();
            cursoA.add(studentCode);
        }

        System.out.print("How many students for course B? ");
        int quantityB = sc.nextInt();
        Set<Integer> cursoB = new HashSet<>();
        for (int i = 0; i < quantityB; i++) {
            int studentCode = sc.nextInt();
            cursoB.add(studentCode);
        }

        System.out.print("How many students for course C? ");
        int quantityC = sc.nextInt();
        Set<Integer> cursoC = new HashSet<>();
        for (int i = 0; i < quantityC; i++) {
            int studentCode = sc.nextInt();
            cursoC.add(studentCode);
        }

        Set<Integer> totalAlunos = new HashSet<>(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);

        System.out.println("Total students: " + totalAlunos.size());

        sc.close(); 
    }
}