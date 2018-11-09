package com.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Cidade;
import com.cursomc.domain.Cliente;
import com.cursomc.domain.Endereco;
import com.cursomc.domain.Estado;
import com.cursomc.domain.ItemPedido;
import com.cursomc.domain.Pagamento;
import com.cursomc.domain.PagamentoComBoleto;
import com.cursomc.domain.PagamentoComCartao;
import com.cursomc.domain.Pedido;
import com.cursomc.domain.Produto;
import com.cursomc.domain.enums.EstadoPagamento;
import com.cursomc.domain.enums.TipoCliente;
import com.cursomc.repositories.CategoriaRepository;
import com.cursomc.repositories.CidadeRepository;
import com.cursomc.repositories.ClienteRepository;
import com.cursomc.repositories.EnderecoRepository;
import com.cursomc.repositories.EstadoRepository;
import com.cursomc.repositories.ItemPedidoRepository;
import com.cursomc.repositories.PagamentoRepository;
import com.cursomc.repositories.PedidoRepository;
import com.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// CATEGORIAS E PRODUTOS
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritorio");
		Categoria cat3 = new Categoria(null,"Cama mesa e banho");
		Categoria cat4 = new Categoria(null,"Eletrônicos");
		Categoria cat5 = new Categoria(null,"Jardinagem");
		Categoria cat6 = new Categoria(null,"Perfumaria");
		Categoria cat7 = new Categoria(null,"Vestiário");
		Categoria cat8 = new Categoria(null,"Calçados");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Pen Drive 16GB", 20.00);
		
		Produto p10 = new Produto(null, "Produto 10", 180.00);
		Produto p11 = new Produto(null, "Produto 11", 1.00);
		Produto p12 = new Produto(null, "Produto 12", 12.00);
		Produto p13 = new Produto(null, "Produto 13", 13.00);
		Produto p14 = new Produto(null, "Produto 14", 14.00);
		Produto p15 = new Produto(null, "Produto 15", 15.00);
		Produto p16 = new Produto(null, "Produto 16", 16.00);
		Produto p17 = new Produto(null, "Produto 17", 17.00);
		Produto p18 = new Produto(null, "Produto 18", 18.00);
		Produto p19 = new Produto(null, "Produto 19", 19.00);
		Produto p20 = new Produto(null, "Produto 20", 20.00);
		Produto p21 = new Produto(null, "Produto 21", 21.00);
		Produto p22 = new Produto(null, "Produto 22", 22.00);
		Produto p23 = new Produto(null, "Produto 23", 23.00);
		Produto p24 = new Produto(null, "Produto 24", 24.00);
		Produto p25 = new Produto(null, "Produto 25", 25.00);
		Produto p26 = new Produto(null, "Produto 26", 26.00);
		Produto p27 = new Produto(null, "Produto 27", 27.00);
		Produto p28 = new Produto(null, "Produto 28", 28.00);
		Produto p29 = new Produto(null, "Produto 29", 29.00);
		Produto p30 = new Produto(null, "Produto 30", 30.00);
		Produto p31 = new Produto(null, "Produto 31", 31.00);
		Produto p32 = new Produto(null, "Produto 32", 32.00);
		Produto p33 = new Produto(null, "Produto 33", 33.00);
		Produto p34 = new Produto(null, "Produto 34", 34.00);
		Produto p35 = new Produto(null, "Produto 35", 35.00);
		Produto p36 = new Produto(null, "Produto 36", 10.00);
		Produto p37 = new Produto(null, "Produto 37", 10.00);
		Produto p38 = new Produto(null, "Produto 38", 10.00);
		Produto p39 = new Produto(null, "Produto 39", 10.00);
		Produto p40 = new Produto(null, "Produto 40", 10.00);
		Produto p41 = new Produto(null, "Produto 41", 10.00);
		Produto p42 = new Produto(null, "Produto 42", 10.00);
		Produto p43 = new Produto(null, "Produto 43", 10.00);
		Produto p44 = new Produto(null, "Produto 44", 10.00);
		Produto p45 = new Produto(null, "Produto 45", 10.00);
		Produto p46 = new Produto(null, "Produto 46", 10.00);
		Produto p47 = new Produto(null, "Produto 47", 10.00);
		Produto p48 = new Produto(null, "Produto 48", 10.00);
		Produto p49 = new Produto(null, "Produto 49", 10.00);
		Produto p50 = new Produto(null, "Produto 50", 10.00);
		
		
		// cat1.setProdutos(Arrays.asList(p1, p2, p3));
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3, p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		// outra forma de atribuir: cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.setProdutos(Arrays.asList(p2, p4, p10, p11));
		cat3.getProdutos().addAll(Arrays.asList(p13, p14, p17, p18));
		
		p1.setCategorias(Arrays.asList(cat1));
		p2.setCategorias(Arrays.asList(cat1, cat2));
		p3.setCategorias(Arrays.asList(cat1));
		
		p10.getCategorias().add(cat1);
		p11.getCategorias().add(cat1);
		p12.getCategorias().add(cat1);
		p13.getCategorias().add(cat1);
		p14.getCategorias().add(cat1);
		p15.getCategorias().add(cat1);
		p16.getCategorias().add(cat1);
		p17.getCategorias().add(cat1);
		p18.getCategorias().add(cat1);
		p19.getCategorias().add(cat1);
		p20.getCategorias().add(cat1);
		p21.getCategorias().add(cat1);
		p22.getCategorias().add(cat1);
		p23.getCategorias().add(cat1);
		p24.getCategorias().add(cat1);
		p25.getCategorias().add(cat1);
		p26.getCategorias().add(cat1);
		p27.getCategorias().add(cat1);
		p28.getCategorias().add(cat2);
		p29.getCategorias().add(cat2);
		p30.getCategorias().add(cat2);
		p31.getCategorias().add(cat2);
		p32.getCategorias().add(cat2);
		p33.getCategorias().add(cat3);
		p34.getCategorias().add(cat3);
		p35.getCategorias().add(cat3);
		p36.getCategorias().add(cat3);
		p37.getCategorias().add(cat3);
		p38.getCategorias().add(cat3);
		p39.getCategorias().add(cat1);
		p40.getCategorias().add(cat1);
		p41.getCategorias().add(cat1);
		p42.getCategorias().add(cat1);
		p43.getCategorias().add(cat1);
		p44.getCategorias().add(cat1);
		p45.getCategorias().add(cat1);
		p46.getCategorias().add(cat1);
		p47.getCategorias().add(cat1);
		p48.getCategorias().add(cat1);
		p49.getCategorias().add(cat1);
		p50.getCategorias().add(cat1);	
		
		
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8));
		// produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		
		
		// ESTADO E CIDADES
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"São Paulo");
		Cidade c1 = new Cidade(null,"Uberlândia", est1);
		Cidade c2 = new Cidade(null,"São Paulo", est2);
		Cidade c3 = new Cidade(null,"Campinas", est2);
		est1.setCidades(Arrays.asList(c1));
		est2.setCidades(Arrays.asList(c2,c3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		// CLIENTES E ENDERECOS
		Cliente cli1 = new Cliente(null,"Maria Silva", "maria@gmail.com","43637833204", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("981536356","981234258"));
		Endereco e1 = new Endereco (null, "Rua Flores", "300", "Apto 303","Jardim", "38220834", cli1,c1 );
		Endereco e2 = new Endereco (null, "Av Matos", "105", "Sala 800","Centro", "38777012", cli1,c2 );
		cli1.setEnderecos(Arrays.asList(e1, e2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"),cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"),cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2));
		
		pagamentoRepository.saveAll(Arrays.asList(pagto1,pagto2));
	
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 3, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		//ped1.getItens().addAll(Arrays.asList(ip1,ip2));
		//ped2.getItens().addAll(Arrays.asList(ip3));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3));
		
	}
}
