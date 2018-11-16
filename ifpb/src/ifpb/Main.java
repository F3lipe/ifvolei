package ifpb;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);
       double n1 = sc.nextDouble();
       double n2 = sc.nextDouble();
       double n3 = sc.nextDouble();
       double n4 = sc.nextDouble();
       double media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
       if(media >= 7 && media <= 10) {
    	   System.out.println("Aluno aprovado.");
      }
       if(media <= 6.9 && media <= 0) {
    	  System.out.println("Aluno reprovado.");
      }
       if(media < 5 && media <= 0) {
    	  System.out.println("Aluno reprovado.");
      }
       }}
