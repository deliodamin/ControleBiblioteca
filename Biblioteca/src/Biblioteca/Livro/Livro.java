package Biblioteca.Livro;

public class Livro {
	
	int ISBN;
	String titulo;
	String assunto;
	String autores;
	String editora;
	String edicao;
	int ano;
	String idioma;
	String paisOrigem;
	String paisPublicação;
	int numPaginas;
	boolean disponivel;
	boolean reservado;
	
	public Livro(int iSBN, String titulo, boolean disponibilidade, boolean dispreserva) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.disponivel = disponibilidade;
		this.reservado = dispreserva;
		
	}
	
	
	public Livro(){
		
	}


	public String getNome() {
		// TODO Auto-generated method stub
		return titulo;
	}

	public Boolean getDisp() {
		// TODO Auto-generated method stub
		return disponivel;
	}


	public Boolean getReser() {
		// TODO Auto-generated method stub
		
		return reservado;	
		
		
	
	}


	public Boolean getDevolucao() {
		// TODO Auto-generated method stub
		disponivel = true;
		return disponivel;
	}


	public String getResFut() {
		// TODO Auto-generated method stub
		reservado = true;
		return "Reserva futura agendada";
	}
	
	
}

	
	
	
	

