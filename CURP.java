import java.util.*;

public class CURP{
	
	public static String claveEstado(String st){
		if(st.equalsIgnoreCase("AGUASCALIENTES")){
			return "AS";
		}
		else if(st.equalsIgnoreCase("BAJA CALIFORNIA")){
			return "BC";
		}
		else if(st.equalsIgnoreCase("BAJA CALIFORNIA SUR")){
			return "BS";
		}
		else if(st.equalsIgnoreCase("CAMPECHE")){
			return "CC";
		}
		else if(st.equalsIgnoreCase("COAHUILA")){
			return "CL";
		}
		else if(st.equalsIgnoreCase("COLIMA")){
			return "CM";
		}
		else if(st.equalsIgnoreCase("CHIAPAS")){
			return "CS";
		}
		else if(st.equalsIgnoreCase("CHIHUAHUA")){
			return "CH";
		}
		else if(st.equalsIgnoreCase("CIUDAD DE MEXICO")){
			return "DF";
		}
		else if(st.equalsIgnoreCase("DURANGO")){
			return "DG";
		}
		else if(st.equalsIgnoreCase("GUANAJUATO")){
			return "GT";
		}
		else if(st.equalsIgnoreCase("GUERRERO")){
			return "GR";
		}
		else if(st.equalsIgnoreCase("HIDALGO")){
			return "HG";
		}
		else if(st.equalsIgnoreCase("JALISCO")){
			return "JC";
		}
		else if(st.equalsIgnoreCase("MEXICO")){
			return "MC";
		}
		else if(st.equalsIgnoreCase("MICHOACAN")){
			return "MN";
		}
		else if(st.equalsIgnoreCase("MORELOS")){
			return "MS";
		}
		else if(st.equalsIgnoreCase("NAYARIT")){
			return "NT";
		}
		else if(st.equalsIgnoreCase("NUEVO LEON")){
			return "NL";
		}
		else if(st.equalsIgnoreCase("OAXACA")){
			return "OC";
		}
		else if(st.equalsIgnoreCase("PUEBLA")){
			return "PL";
		}
		else if(st.equalsIgnoreCase("QUERETARO")){
			return "QT";
		}
		else if(st.equalsIgnoreCase("QUINTANA ROO")){
			return "QR";
		}
		else if(st.equalsIgnoreCase("SAN LUIS POTOSI")){
			return "SP";
		}
		else if(st.equalsIgnoreCase("SINALOA")){
			return "SL";
		}
		else if(st.equalsIgnoreCase("SONORA")){
			return "SR";
		}
		else if(st.equalsIgnoreCase("TABASCO")){
			return "TC";
		}
		else if(st.equalsIgnoreCase("TAMAULIPAS")){
			return "TS";
		}
		else if(st.equalsIgnoreCase("TLAXCALA")){
			return "TL";
		}
		else if(st.equalsIgnoreCase("VERACRUZ")){
			return "VZ";
		}
		else if(st.equalsIgnoreCase("YUCATAN")){
			return "YN";
		}
		else if(st.equalsIgnoreCase("ZACATECAS")){
			return "ZS";
		}
		else{
			return "NE";
		}
	}
	
	public static char primeraVocal(String cad){
		String aux;
		aux = cad.toUpperCase();
		for(int i = 1; i < cad.length(); i++){
			switch(aux.charAt(i)){
				case 'A':
					return aux.charAt(i);
				case 'E':
					return aux.charAt(i);
				case 'I':
					return aux.charAt(i);
				case 'O':
					return aux.charAt(i);
				case 'U':
					return aux.charAt(i);
				default:
					break;
			}
		}
		return 'N';
	}
	
	public static char primeraConsonante(String cad){
		String aux;
		aux = cad.toUpperCase();
		for(int i = 1; i < aux.length(); i++){
			switch(aux.charAt(i)){
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					break;
				default:
					return aux.charAt(i);
			}
		}
		return 'X';
	}
	
	public static char numOChar(int agno){
		Random gen = new Random();
		int num;
		String res;
		
		if(agno >= 2000){
			num = gen.nextInt(25) + 65;
			return (char)num;
		}
		else{
			num = gen.nextInt(9);
			res = Integer.toString(num);
			return res.charAt(0);
		}
	}
}