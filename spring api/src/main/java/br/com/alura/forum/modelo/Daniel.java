package br.com.alura.forum.modelo;

public class Daniel {
	
	
	public static void main(String [] args) {
		
		mostraNome();
	}
	
	
	public static void mostraNome() {
		UsuarioDaniel qualquercoisa = new UsuarioDaniel();
		
		qualquercoisa.setNome("Daniel");
		qualquercoisa.setEmail("email@teste.com.br");
		
		System.out.println(qualquercoisa.getNome());
		System.out.println(qualquercoisa.getEmail());
		
	}

}
