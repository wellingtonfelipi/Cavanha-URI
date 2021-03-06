/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1180      |
+--------------------+
*/
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		

		int n = sc.nextInt();
		int menor=0, posicao=0;
		
		int[] x = new int[n];
		
		for (int i=0; i<n; i++){
			x[i]=sc.nextInt();
		}
		
		for (int j=0; j<n; j++){
			if (x[j] < menor){
				menor = x[j];
				posicao = j;
			}
		}

	System.out.printf("Menor valor: %d\n",menor);
	System.out.printf("Posicao: %d\n",posicao);
	sc.close();
	}
}