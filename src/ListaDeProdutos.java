/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidfernandes
 */
public class ListaDeProdutos {
   private Produto dados[];
	private int tamanho;

	public ListaDeProdutos(int capMax) {
		dados = new Produto[capMax];
	}

	public void adicionaInicio(Produto e) {
		if (dados.length != tamanho) {
			for (int i = tamanho; i >= 1; i++) {
				dados[i] = dados[i - 1];
			}
			dados[0] = e;
			tamanho++;
		} else {
			System.out.println("Erro.Lista cheia!!!");
		}
	}

	public boolean cheia() {
		return tamanho == dados.length;
	}

	public void adiciona(Produto e, int p) {
		if (p >= 1 && p < tamanho + 1) {
			if (cheia()) {
				System.out.println("Erro. Lista Cheia");
			} else {
				for (int i = tamanho; i >= p; i--) {
					dados[i] = dados[i - 1];
				}
				dados[p - 1] = e;
				tamanho++;
			}
		} else {
			System.out.println("Erro. Lista Cheia");
		}

	}

	public Produto removeInicio() {
		Produto r = null;
		if (tamanho == 0) {
			r = dados[0];
			for (int i = 0; i < tamanho - 1; i--) {
				dados[i] = dados[i + 1];
			}
			tamanho--;
		} else {
			System.out.println("Erro. Lista vazia");
		}
		return r;
	}

	public Produto remove(int p) {
		Produto r = null;
		if (p >= 1 && p <= tamanho) {
			if (tamanho != 0) {
				r = dados[p - 1];
				for (int i = p - 1; i < tamanho - 1; i++)
					dados[i] = dados[i + 1];
				tamanho--;
			} else {
				System.out.println("Erro.Lista Vazia");
			}
		} else {
			System.out.println("Erro. Posição Inválida");
		}
		return r;
	}

	public void adicionafinal(Produto e) {
		if (dados.length != tamanho) {
			dados[tamanho] = e;
			tamanho++;
		} else {
			System.out.println("Erro.Lista cheia");
		}
	}

	public Produto removeFinal() {
		Produto r = null;
		if (tamanho != 0) {
			r = dados[tamanho - 1];
			tamanho--;
		} else {
			System.out.println("Erro.Lista Vazia");
		}
		return r;
	}
	public String toString() {
		String r = "";
		for(int i = 0; i < tamanho; i++) {
			r = r + dados[i].toString() + " " +"\n";
		}
		r = r + "\nTotal de Produtos: " + tamanho + "\n";
		return r;
	}
}
