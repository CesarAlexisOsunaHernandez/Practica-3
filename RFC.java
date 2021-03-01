public class RFC{
	public static String claveDiferenciadora(String nombre, String apPa, String apMa){
		String clave = "0", nombreCompleto = apPa.toUpperCase() + " " + apMa.toUpperCase() + " " + nombre.toUpperCase();
		int n1, n2, total = 0, mod, res, aux = 0;
		
		for(int i = 0; i < nombreCompleto.length(); i++){
			clave += tabla1(nombreCompleto.charAt(i)); 
		}
		
		if(clave.length() % 2 != 0){
			aux = (int)(clave.charAt(clave.length() - 1) - 48);
			clave += '0';
		}
		
		for(int i = 0; i < clave.length(); i+=2){
			n1 = Integer.parseInt(clave.substring(i, i + 2));
			n2 = Integer.parseInt(clave.substring(i + 1, i + 2));
			total += n1 * n2;
		}
		total += aux;
		
		n1 = Integer.toString(total).length();
		
		total = Integer.parseInt(Integer.toString(total).substring(n1 - 3, n1));
		
		mod = total % 34;
		res = total / 34;
		
		System.out.println("total: " + total + " mod: " + mod + " res: " + res);
		
		return tabla2(res) + tabla2(mod);
	}
	
	public static String digitoVerificador(String RFC){
		int suma = 0, mod;
		for(int i = 0, j = 13; i < RFC.length(); i++, j--){
			suma += tabla3(RFC.charAt(i)) * j;
		}
		
		mod = suma % 11;
		
		if(mod == 0){
			return Integer.toString(mod);
		}
		else if(mod == 10){
			return "A";
		}
		else{
			return Integer.toString(11 - mod);
		}
	}
	
	private static String tabla1(char ltr){
		int aux;
		if(ltr == ' '){
			return "00";
		}
		else if(ltr == 165){
			return "40";
		}
		else if(ltr == '&'){
			return "10";
		}
		else{
			aux = (int)(ltr - 54);
			if(aux > 19){
				aux++;
				if(aux > 29){
					aux+=2;
				}
			}
			return Integer.toString(aux);
		}
	}
	
	private static String tabla2(int num){
		char aux;
		if(num < 9){
			num += 49;
		}
		else if(num < 23){
			num += 56;
		}
		else{
			num += 57;
		}
		aux = (char)(num);
		return String.valueOf(aux);
	}
	
	private static int tabla3(char ltr){
		int aux;
		if(ltr == ' '){
			return 37;
		}
		else if(ltr == 165){
			return 38;
		}
		else if(ltr == '&'){
			return 24;
		}
		else if(ltr - 48 < 10){
			return ltr - 48;
		}
		else if(ltr < 79){
			return ltr - 55;
		}
		else{
			return ltr - 54;
		}
	}
}