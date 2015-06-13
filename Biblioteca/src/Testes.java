import static org.junit.Assert.*;

import org.junit.Test;

import Biblioteca.Funcionarios.Bibliotecario;
import Biblioteca.Livro.Livro;


public class Testes {

	@Test
	public void testaCadastroLivro() {
		
		
		Bibliotecario biblio  = new Bibliotecario();
		Livro novoLivro = null; 
		//biblio.cadastraLivro(novoLivro);
		assertTrue(biblio.cadastraLivro(novoLivro)); 
		//fail("Not yet implemented");
	}

	
	
	@Test
	public void testaConsultaLivro() {
		
		
		Livro buscaLivro   = new Livro(123, "Nome Livro2");
		
		String nome = buscaLivro.getNome();
		
		assertEquals("Nome Livro", nome);
		
		
	}
}
