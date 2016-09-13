import java.util.*;
import javax.net.ssl.*;

public class Main
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
	    int[] user = new int[7];
		int [] comp = {2,4,1,7,1,0,1};
		int [] random = new int [7];
		Random rnd = new Random();
		System.out.print("Mennyi sör csúszott le a(z) ");
		for(int i = 0; i < 7; i++){
		System.out.println((i + 1) + ". napon?");
		user[i] = sc.nextInt();
		random[i] = rnd.nextInt(10);
		}
		System.out.println("Szerinted ennyit ittál: ");
		for(int i = 0; i <user.length; i++){
			System.out.println("A(z) " + (i + 1) + ". napon " + user[i] + " sört ittam.");
		}
		System.out.println("Szerintem ennyi sört ittál: ");
		for( int i = 0; i < comp.length; i++){
			System.out.println("A(z) " + (i + 1) + ". napon " + comp[i] + " sört ittál.");
		}
		System.out.println("Ha véletlenül ittál volna:");
	    for( int i =0; i < random.length; i++){
		System.out.println("A(z) " + (i + 1) + ". napon véletlenül " + random[i] + " sört ittál volna.");
		}
		}
}
