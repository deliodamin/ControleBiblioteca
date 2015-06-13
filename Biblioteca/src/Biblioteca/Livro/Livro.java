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
	
	
	public Livro(int iSBN, String titulo) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
	}
	
	
	public Livro(){
		
	}


	public String getNome() {
		// TODO Auto-generated method stub
		return titulo;
	}



	
	
	
}
