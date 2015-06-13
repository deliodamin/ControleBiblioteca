import static org.junit.Assert.*;

import org.junit.Test;

import Biblioteca.Funcionarios.Bibliotecario;
import Biblioteca.Livro.Livro;


public class Testes {

	@Test
	public void testaCadastroLivro() {
		
		
		Bibliotecario biblio  = new Bibliotecario();
		Livro novoLivro= null; 
		//biblio.cadastraLivro(novoLivro);
		assertTrue(biblio.cadastraLivro(novoLivro)); 
		//fail("Not yet implemented");
	}

	@Test
	public void testaConsultaLivro() {
		Livro buscaLivro   = new Livro(123, "Nome Livro", false, false);
		String nome = buscaLivro.getNome();
		assertEquals("Nome Livro", nome);
	}
	
	@Test
	public void testaSolicitaEmprestimo() {
		//Livro buscaLivro   = new Livro(123, "Nome Livro2");
		Livro dispLivro   = new Livro(123, "Nome Livro", true, false);
		Boolean disp = dispLivro.getDisp();
		assertTrue(disp);
	}
	
	//Como um aluno, eu quero renovar o empréstimo de 
	//um livro sem reserva para que eu possa permanecer com o livro.
	
	@Test
	public void testaRenovaEmprestimo() {
		//Livro buscaLivro   = new Livro(123, "Nome Livro2");
		Livro reservaLivro   = new Livro(123, "Nome Livro", true, false);
		Boolean dispreser = reservaLivro.getReser();
		assertFalse(dispreser);
	}
	
	//Como um aluno, eu quero devolver um livro emprestado para que seja disponibilizado 
	//no acerto da biblioteca.
	
	@Test
	public void testaDevolucao() {
		//Livro buscaLivro   = new Livro(123, "Nome Livro2");
		Livro devolLivro   = new Livro(123, "Nome Livro", false, true);
		Boolean StatusDevolu = devolLivro.getDevolucao();
		assertTrue(StatusDevolu);
	}
	

	//Como um aluno, eu quero reservar um livro para que eu possa solicitar 
	//seu empréstimo no futuro.
@Test
public void testaReservaFutura() {
	Livro resLivro   = new Livro(123, "Nome Livro", false, false);
	String resFut = resLivro.getResFut();
	assertEquals("Reserva futura agendada" , resFut );
}




}