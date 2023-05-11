package com.example.gs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Viagem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@NotBlank
	private String primeiroComandante;

	@Pattern(regexp = "[A-Z]{3}-\\d{4}-[A-Z]\\d[A-Z]", message = "Matricula fora do padrão XXX-9999-X9X")
	private String matriculaPrimeiroComandante;

	@NotNull
	@NotBlank
	private String segundoComandante;

	@Pattern(regexp = "^[A-Z]{3}-\\d{4}-[A-Z]\\d[A-Z]$", message = "Matricula")
	// fora do padrão XXX-9999-X9X")
	private String matriculaSegundoComandante;
	private String tipoNave;
	private int quantidadeAssentos;
	private int duracaoDias;
	private String dataDecolagem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroComandante() {
		return primeiroComandante;
	}

	public void setPrimeiroComandante(String primeiroComandante) {
		this.primeiroComandante = primeiroComandante;
	}

	public String getMatriculaPrimeiroComandante() {
		return matriculaPrimeiroComandante;
	}

	public void setMatriculaPrimeiroComandante(String matriculaPrimeiroComandante) {
		this.matriculaPrimeiroComandante = matriculaPrimeiroComandante;
	}

	public String getSegundoComandante() {
		return segundoComandante;
	}

	public void setSegundoComandante(String segundoComandante) {
		this.segundoComandante = segundoComandante;
	}

	public String getMatriculaSegundoComandante() {
		return matriculaSegundoComandante;
	}

	public void setMatriculaSegundoComandante(String matriculaSegundoComandante) {
		this.matriculaSegundoComandante = matriculaSegundoComandante;
	}

	public String getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(String tipoNave) {
		this.tipoNave = tipoNave;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	public int getDuracaoDias() {
		return duracaoDias;
	}

	public void setDuracaoDias(int duracaoDias) {
		this.duracaoDias = duracaoDias;
	}

	public String getDataDecolagem() {
		return dataDecolagem;
	}

	public void setDataDecolagem(String dataDecolagem) {
		this.dataDecolagem = dataDecolagem;
	}

	public void fromViagem(Viagem viagem) {
		this.primeiroComandante = viagem.getPrimeiroComandante();
		this.matriculaPrimeiroComandante = viagem.getMatriculaPrimeiroComandante();
		this.segundoComandante = viagem.getSegundoComandante();
		this.matriculaSegundoComandante = viagem.getMatriculaSegundoComandante();
		this.tipoNave = viagem.getTipoNave();
		this.quantidadeAssentos = viagem.getQuantidadeAssentos();
		this.duracaoDias = viagem.getDuracaoDias();
		this.dataDecolagem = viagem.getDataDecolagem();
	}
}
