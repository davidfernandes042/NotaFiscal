/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidfernandes
 */
public class PilhaDeNF {
   NotaFiscal dados[];
	int topo;
	
	public PilhaDeNF(int capacidade) {
		dados = new NotaFiscal[capacidade];
		topo= -1;
	}
	
	public boolean cheia() {
		return topo == dados.length - 1;
	}
	
	
	public boolean vazia() {
		return topo == -1;
	}
	
	public void empilha(NotaFiscal e) {
		if(cheia()) {
			System.out.println("Erro.Pilha Cheia");
		}else {
			topo++;
			dados[topo] = e;
		}
	}
	public NotaFiscal desempilha() {
		NotaFiscal resp = null;
		if(vazia()) {
			System.out.println("Erro. Fila vazia");
		}else {
			resp = dados[topo];
			topo --;
		}
		return resp;
	}
	
	public String toString() {
		String resp = "";
		for(int i = topo; i >= 0; i ++) {
			resp = resp+ "\t" + dados[i].toString();
		}
		return resp;
	}
}
