public class CURPRFC{
	public static void main(String args[]){
		Persona p1 = new Persona();
		int op;
		String auxi;
		
		do{
			System.out.println("\n1)CURP");
			System.out.println("2)RFC");
			System.out.println("3)Salir");
			op = CapturaEntrada.capturarEntero("");
			
			switch(op){
				case 1:
					p1.setNombre(CapturaEntrada.capturarString("\nNombre completo: "));
					
					p1.fechaNacimiento = new Fecha(CapturaEntrada.capturarString("\nFecha de nacimiento: "));
					
					p1.setSexo(CapturaEntrada.capturarString("\nSexo(H/M): "));
					
					p1.setEstado(CapturaEntrada.capturarString("\nEstado de nacimiento: "));
					
					p1.setCURP(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre())).substring(0,1));
					p1.setCURP(p1.getCURP() + CURP.primeraVocal(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()))));
					p1.setCURP(p1.getCURP() + Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()) + 1).substring(0,1));
					p1.setCURP(p1.getCURP() + Nombre.separarNombre(p1.getNombre(), 1).substring(0,1));
					p1.setCURP(p1.getCURP() + p1.fechaNacimiento.toString() + p1.getSexo().toUpperCase() + CURP.claveEstado(p1.getEstado()));
					p1.setCURP(p1.getCURP() + CURP.primeraConsonante(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()))));
					p1.setCURP(p1.getCURP() + CURP.primeraConsonante(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()) + 1)));
					p1.setCURP(p1.getCURP() + CURP.primeraConsonante(Nombre.separarNombre(p1.getNombre(), 1)) + CURP.numOChar(p1.fechaNacimiento.getAgno()) + CURP.numOChar(0));
					
					System.out.println("\n\nCURP: " + p1.getCURP());
					
					break;
				case 2:
					p1.setNombre(CapturaEntrada.capturarString("\nNombre completo: "));
					
					p1.fechaNacimiento = new Fecha(CapturaEntrada.capturarString("\nFecha de nacimiento: "));
					
					p1.setRFC(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre())).substring(0,1));
					p1.setRFC(p1.getRFC() + CURP.primeraVocal(Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()))));
					p1.setRFC(p1.getRFC() + Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()) + 1).substring(0,1));
					p1.setRFC(p1.getRFC() + Nombre.separarNombre(p1.getNombre(), 1).substring(0,1));
					p1.setRFC(p1.getRFC() + p1.fechaNacimiento.toString());
					p1.setRFC(p1.getRFC() + RFC.claveDiferenciadora(Nombre.separarNombre(p1.getNombre(), 1), Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()) + 1), Nombre.separarNombre(p1.getNombre(), Nombre.spacesInNombre(p1.getNombre()))));
					
					
					auxi = RFC.digitoVerificador(p1.getRFC());
					
					p1.setRFC(p1.getRFC() + auxi);
					System.out.println("\n\nRFC: " + p1.getRFC());
					
					break;
				default:
					break;
			}
		}while(op != 3);
	}
}