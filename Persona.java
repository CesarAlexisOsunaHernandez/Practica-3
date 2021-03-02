public class Persona{
	private String nombre, CURP, RFC, sexo, estado;
	public Fecha fechaNacimiento;
	
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
}