import java.util.*;

public class CapturaEntrada{
	public static int capturarEntero(String msg){
		Scanner ents = new Scanner(System.in);
		System.out.print(msg);
		return (ents.nextInt());
	}
	
	public static String capturarString(String msg){
		Scanner str = new Scanner(System.in);
		System.out.print(msg);
		return (str.nextLine());
	}
	
}