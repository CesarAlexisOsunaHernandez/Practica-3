public class Fecha{
	private int dia, agno;
	private String mes;
	
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public int getDia(){
		return dia;
	}
	
	public void setMes(String mes){
		this.mes = mes;
	}
	
	public String getMes(){
		return mes;
	}
	
	public void setAgno(int agno){
		this.agno = agno;
	}
	
	public int getAgno(){
		return agno;
	}
	
	public String toString(){
		String dia, agno;
		agno = Integer.toString(this.agno).substring(2,4);
		
		if(this.dia > 9){
			dia = Integer.toString(this.dia).substring(0,2);
		}
		else{
			dia = "0" + Integer.toString(this.dia).substring(0,1);
		}
		
		return agno + mesStrToNum() + dia;
	}
	
	public String mesStrToNum(){
		if(mes.equalsIgnoreCase("ENERO")){
			return "01";
		}
		else if(mes.equalsIgnoreCase("FEBRERO")){
			return "02";
		}
		else if(mes.equalsIgnoreCase("MARZO")){
			return "03";
		}
		else if(mes.equalsIgnoreCase("ABRIL")){
			return "04";
		}
		else if(mes.equalsIgnoreCase("MAYO")){
			return "05";
		}
		else if(mes.equalsIgnoreCase("JUNIO")){
			return "06";
		}
		else if(mes.equalsIgnoreCase("JULIO")){
			return "07";
		}
		else if(mes.equalsIgnoreCase("AGOSTO")){
			return "08";
		}
		else if(mes.equalsIgnoreCase("SEPTIEMBRE")){
			return "09";
		}
		else if(mes.equalsIgnoreCase("OCTUBRE")){
			return "10";
		}
		else if(mes.equalsIgnoreCase("NOVIEMBRE")){
			return "11";
		}
		else if(mes.equalsIgnoreCase("DICIEMBRE")){
			return "12";
		}
		else{
			return "X";
		}
	}
}