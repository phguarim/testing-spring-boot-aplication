package com.etecja.testingspringbootaplication;

import javax.xml.crypto.Data;

public class aluno {
	public String matricula;
	public int codcurso;
	public String nome;
	public int idade;
	public String endereco;
	public String email;
	public int cpf;
	public int rg;
	public Data data_entrada;
	public Data data_termino;
	public char trancado;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getCodcurso() {
		return codcurso;
	}
	public void setCodcurso(int codcurso) {
		this.codcurso = codcurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public Data getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Data data_entrada) {
		this.data_entrada = data_entrada;
	}
	public Data getData_termino() {
		return data_termino;
	}
	public void setData_termino(Data data_termino) {
		this.data_termino = data_termino;
	}
	public char getTrancado() {
		return trancado;
	}
	public void setTrancado(char trancado) {
		this.trancado = trancado;
	}
	
}
