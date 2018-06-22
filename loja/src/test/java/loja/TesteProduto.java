package loja;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import br.unibh.loja.entidades.Categoria;
import br.unibh.loja.entidades.Produto;


public class TesteProduto {
	@Test
	public void testCreateObject() {
		Categoria ca = new Categoria(1L,"ASD");
		Produto c = new Produto(1L,"prod","desc",ca,new BigDecimal(10.00),"fab");
		assertEquals(c.getId(), new Long(1));
		assertEquals(c.getNome(), "prod");
		assertEquals(c.getDescricao(), "desc");
		assertEquals(c.getCategoria(), ca);
		assertEquals(c.getPreco(), new BigDecimal(10.00));
		assertEquals(c.getFabricante(), "fab");
	}

	@Test
	public void testCompareObjects() {
		Categoria ca = new Categoria(1L,"ASD");
		Produto c1 = new Produto(1L,"prod","desc",ca,new BigDecimal(10.00),"fab");
		Produto c2 = new Produto(1L,"prodd","desc",ca,new BigDecimal(10.00),"fab");
		assertNotEquals(c1, c2);
	}

	@Test
	public void testGenerateHash() {
		Categoria ca = new Categoria(1L,"ASD");
		Produto c1 = new Produto(1L,"prod","desc",ca,new BigDecimal(10.00),"fab");
		Produto c2 = new Produto(1L,"prod","desc",ca,new BigDecimal(10.00),"fab");
		assertEquals(c1.hashCode(), c2.hashCode());
		Produto c3 = new Produto(1L,"prodd","desc",ca,new BigDecimal(10.00),"fab");
		assertNotEquals(c1.hashCode(), c3.hashCode());
	}

	public void testPrintObject() {
		Categoria ca = new Categoria(1L,"ASD");
		Produto c1 = new Produto(1L,"prod","desc",ca,new BigDecimal(10.00),"fab");
		assertEquals(c1.toString(),
				"Produto [id = 1L,nome = prod, descricao = desc, preco = new BigDecimal(10.00), fabricante = fab]");
		
	}

}
