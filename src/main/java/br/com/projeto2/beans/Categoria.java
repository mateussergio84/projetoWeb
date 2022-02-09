package br.com.projeto2.beans;

public enum Categoria {
	Medicamento(0), Generico(1), Higiene(2), Bebe(3);

	public int numCategoria;

	Categoria(int num) {
		numCategoria = num;
	}

}
