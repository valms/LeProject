package com.br.fortec.operacoes;

public class Operacoes {

	public static float soma(float... param) {
		float soma = 0.00000f;

		for (int i = 0; i < param.length; i++) {
			soma += param[i];
		}

		return soma;
	}

	public static float diferenca(float... param) {
		float diferenca = 0.00000f;

		for (int i = 0; i < param.length; i++) {
			diferenca -= param[i];
		}

		return diferenca;
	}

	public static float multiplicacao(float... param) {
		float multiplicacao = 1.00000f;

		for (int i = 0; i < param.length; i++) {
			multiplicacao = multiplicacao * param[i];
		}

		return multiplicacao;
	}

	public static float divisao(float... param) {
		float divisao = 1.00000f;

		for (int i = 0; i < param.length; i++) {
			divisao /= param[i];
		}

		return divisao;
	}
}