/*
+--------------------+
| Rodrigo CavanhaMan |
|        IFTM        |
|      URI 1156      |
+--------------------+
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double s=1, x, y=2;
		for (x=3; x<=39; x=x+2){
			s = s + (x/y);
			y=y*2;
		}
		System.out.printf("%.2f\n",s);
		sc.close();
	}
}