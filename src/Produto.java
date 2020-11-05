/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidfernandes
 */
public class Produto {
 private int cod;
	private String descricao, lote;
	private double preco;
	
	public Produto(int cod, String descricao, String lote, double preco) {
		this.cod = cod;
		this.descricao = descricao;
		this.lote = lote;
		this.preco =preco;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Codigo " + cod + ", descrição = " + descricao + ", lote" + lote  + ", preco = " + preco;
	}

	
}

