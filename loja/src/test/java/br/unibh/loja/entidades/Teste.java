package br.unibh.loja.entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class Teste{
	
	@Test
	public void testCreateObject() {
		Categoria categoria = new Categoria(1L,"Smartphone");
		BigDecimal preco1 = new BigDecimal("400.11");
		Produto c = new Produto(1L, "J7", "Smartphone 4GB 32GB", categoria, preco1, "Samsung");
		assertEquals(categoria.getId(),new Long(1));
		assertEquals(categoria.getDescricao(),"Smartphone");
		assertEquals(c.getId(),new Long(1));
		assertEquals(c.getNome(),"J7");
		assertEquals(c.getDescricao(),"Smartphone 4GB 32GB");
		assertEquals(c.getCategoria(),categoria);
		assertEquals(c.getPreco(),preco1);
		assertEquals(c.getFabricante(),"Samsung");
	}
	
	@Test
	public void testCompareObjects() {
		Categoria categoria = new Categoria(1L,"Smartphone");
		BigDecimal preco1 = new BigDecimal("400.11");
		Produto c1 = new Produto(1L, "J7", "Smartphone 4GB 32GB", categoria, preco1, "Samsung");
		Produto c2 = new Produto(1L, "J7", "Smartphone 2GB 16GB", categoria, preco1, "Samsung");
		assertNotEquals(c1,c2);
	}
	
	@Test
	public void testGenerateHash() {
		Categoria categoria = new Categoria(1L,"Smartphone");
		BigDecimal preco1 = new BigDecimal("400.11");
		Produto c1 = new Produto(1L, "J7", "Smartphone 4GB 32GB", categoria, preco1, "Samsung");
		Produto c2 = new Produto(1L, "J7", "Smartphone 4GB 32GB", categoria, preco1, "Samsung");
		assertEquals(c1.hashCode(), c2.hashCode());
		Produto c3 = new Produto(1L, "J7", "Smartphone 2GB 16GB", categoria, preco1, "Samsung");
		assertNotEquals(c1.hashCode(), c3.hashCode());
	}
	
	@Test
	public void testPrintObject() {
		Categoria categoria = new Categoria(1L,"Smartphone");
		BigDecimal preco1 = new BigDecimal("400.11");
		Produto c1 = new Produto(1L, "J7", "Smartphone 4GB 32GB", categoria, preco1, "Samsung");
		assertEquals(c1.toString(), "Produto [nome=J7, descricao=Smartphone 4GB 32GB, categoria=Categoria [id=1, descricao=Smartphone], preco=400.11, fabricante=Samsung]");
	}
	
}
