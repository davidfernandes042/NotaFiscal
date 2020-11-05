/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidfernandes
 */
public class NotaFiscal {
 private int numero, naturezaOP;
	private String dtEmissao;
	private Cliente cliente;
	private ListaDeProdutos lista;
	
	
	public NotaFiscal(int numero, int naturezaOP, String dtEmissao, Cliente cliente, ListaDeProdutos lista) {
		super();
		this.numero = numero;
		this.naturezaOP = naturezaOP;
		this.dtEmissao = dtEmissao;
		this.cliente = cliente;
		this.lista = lista;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getNaturezaOP() {
		return naturezaOP;
	}


	public void setNaturezaOP(int naturezaOP) {
		this.naturezaOP = naturezaOP;
	}


	public String getDtEmissao() {
		return dtEmissao;
	}


	public void setDtEmissao(String dtEmissao) {
		this.dtEmissao = dtEmissao;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public ListaDeProdutos getLista() {
		return lista;
	}


	public void setLista(ListaDeProdutos lista) {
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "NotaFiscal - numero=" + numero + 
				"\nnaturezaOP=" + naturezaOP + 
				"\ndtEmissao=" + dtEmissao + 
				"\ncliente="+ cliente.toString() + 
				"\nlista=" + lista.toString();
	}
	
	
	
	

}
