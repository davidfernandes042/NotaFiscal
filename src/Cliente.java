/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidfernandes
 */
public class Cliente {
    private String id;
	private String endereco;
	private String nome;
	
	public Cliente ( String nome, String id, String endereco) {
		this.id = id;
		this.endereco = endereco;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "CPF ou CNPJ = " + id + "\nnome = " + nome + "\nendereço = " + endereco ;
	}
	
	
}

