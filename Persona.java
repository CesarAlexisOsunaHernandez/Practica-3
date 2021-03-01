public class Persona{
	private String nombre, CURP, RFC, sexo, estado;
	public Fecha fechaNacimiento = new Fecha();
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public void setRFC(String RFC){
		this.RFC = RFC;
	}
	
	public String getRFC(){
		return RFC;
	}
	
	public void setCURP(String CURP){
		this.CURP = CURP;
	}
	
	public String getCURP(){
		return CURP;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;
	}
	
	public int spacesInNombre(String str){
		int spaces = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				spaces++;
			}
		}
		return spaces;
	}
	
	public String separarNombre(String nombre, int op){
		int spacePos[] = new int[spacesInNombre(nombre)];
		
		for(int i = 0, j = 0; i < nombre.length(); i++){
			if(nombre.charAt(i) == ' '){
				spacePos[j] = i;
				j++;
			}
		}
		
		if(op > spacesInNombre(nombre)){
			return nombre.substring(spacePos[op - 2] + 1, nombre.length()).toUpperCase();
		}
		else if(op > 1){
			return nombre.substring(spacePos[op - 2] + 1, spacePos[op - 1]).toUpperCase();
		}
		else{
			return nombre.substring(0, spacePos[0]).toUpperCase();
		}
	}
}