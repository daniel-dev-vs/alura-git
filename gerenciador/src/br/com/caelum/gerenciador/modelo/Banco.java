package br.com.caelum.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		
		Empresa empresa = new Empresa(1,"Google");
		Empresa empresa2 = new Empresa(2,"Apple" );
		Empresa empresa3 = new Empresa(3,"Oracle" );
		
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		Banco.lista.add(empresa3);
	}
	
	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
			Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		
		return Banco.lista;
	}

}
