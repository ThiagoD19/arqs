package loja;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import br.unibh.loja.entidades.Categoria;
import br.unibh.loja.entidades.Cliente;

public class Teste {

	@Test
	public void testCreateObject() {
		Cliente c = new Cliente(1L, "Victor", "Vitor960", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				new Date(), new Date());
		assertEquals(c.getId(), new Long(1));
		assertEquals(c.getNome(), "Victor");
		assertEquals(c.getLogin(), "Vitor960");
		assertEquals(c.getSenha(), "123456");
		assertEquals(c.getPerfil(), "adasd");
		assertEquals(c.getCpf(), "55454654");
		assertEquals(c.getTelefone(), "54564642");
		assertEquals(c.getEmail(), "hotmail.com");
		assertEquals(c.getDataNascimento(), new Date());
		assertEquals(c.getDataCadastro(), new Date());

	}

	@Test
	public void testCompareObjects() {
		Cliente c1 = new Cliente(1L, "Victor", "Vitor960", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				new Date(), new Date());
		Cliente c2 = new Cliente(1L, "Victor", "Vitor960", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				new Date(), new Date());
		assertEquals(c1, c2);
	}

	@Test
	public void testGenerateHash() {
		Date d = new Date();
		Cliente c1 = new Cliente(1L, "Victor", "Vitor960", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				d, d);
		Cliente c2 = new Cliente(1L, "Victor", "Vitor960", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				d, d);
		assertEquals(c1.hashCode(), c2.hashCode());
		Cliente c3 = new Cliente(1L, "Victor", "Vitor60", "123456", "adasd", "55454654", "54564642", "hotmail.com",
				new Date(), new Date());
		assertNotEquals(c1.hashCode(), c3.hashCode());
	}

	public void testPrintObject() {
		Cliente c1 = new Cliente(1L,"Victor","Vitor960","123456","adasd","55454654","54564642","hotmail.com",new Date(),new Date());
		assertEquals(c1.toString(),
				"Cliente [id = 1L,nome = Victor,login = Vitor960,senha = 123456,perfil = adasd, cpf = 55454654,telefone = 54564642,email = hotmail.com,dataNascimento = new Date(), dataCadastro = new Date()]");
		
	}
	
	
}
