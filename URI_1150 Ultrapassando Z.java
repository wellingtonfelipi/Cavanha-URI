/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1150      |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, z, soma=0, conta=0, aux=0;

		x = sc.nextInt();
		z = sc.nextInt();
		
		while (z <= x){
			z = sc.nextInt();
		}
		
		while (aux < z && soma < z){
			soma += x;
			conta++;
			x++;
		}
		System.out.println(conta);
		sc.close();
	}
}