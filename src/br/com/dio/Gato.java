package br.com.dio;

import java.util.Objects;

public class Gato {
	private String cor;
	private Integer idade;
	private String raca;

	public Gato(String cor, Integer idade, String raca) {
		this.cor = cor;
		this.idade = idade;
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, raca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(raca, other.raca);
	}

	@Override
	public String toString() {
		return "Gato [cor=" + cor + ", idade=" + idade + ", raca=" + raca + "]";
	}

}
