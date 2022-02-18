package br.com.projeto2.beans;

public enum Categoria {
	Medicamento(0), Generico(1), Dermoscosmeticos(2), infatil(3);

	public int numCategoria;

	Categoria(int num) {
		numCategoria = num;
	}

}
