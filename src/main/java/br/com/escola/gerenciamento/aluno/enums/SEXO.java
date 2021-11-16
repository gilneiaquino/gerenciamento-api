package br.com.escola.gerenciamento.aluno.enums;

public enum SEXO {
	MASCULINO(1), FEMININO(2);

	private Integer valor;

	SEXO(Integer valor) {
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}
}
