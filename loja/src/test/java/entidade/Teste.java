package entidade;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

public class Teste {
	@Test
	public void CriarObjetos() {
		
		Categoria vXobCategoria = new Categoria();
		vXobCategoria.setId(1l);
		vXobCategoria.setDescricao("Gamers");
				
		Cliente vXobCliente = new Cliente();
		vXobCliente.setNome("Breno");
		vXobCliente.setCpf("00011122233");
		vXobCliente.setDataCadastro(new Date());
		vXobCliente.setEmail("brenoaos@windowslive.com");
		
		Produto vXobProduto = new Produto();
		vXobProduto.setNome("gamecube");
		vXobProduto.setId(1L);
		vXobProduto.setFabricante("Sony");
		vXobProduto.setPreco(new BigDecimal(1750));
	}
	
	@Test
	public void CompararObjetos() {
		Categoria vXobCategoria_1 = new Categoria(1l, "Categoria 1");
		Categoria vXobCategoria_2 = new Categoria(2l, "Categoria 2");
		vXobCategoria_1.getDescricao().equals(vXobCategoria_2.getDescricao());
	}
	
	public void ImpressaoObjeto() {
		Produto vXobProduto = new Produto();
		vXobProduto.setNome("Playstation");
		vXobProduto.setId(1L);
		vXobProduto.setFabricante("Sony");
		assertEquals(vXobProduto.getNome(), "Ericson");
	}
}