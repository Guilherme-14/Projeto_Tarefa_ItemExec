package com.projetojpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tarefa")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@NotBlank
	@Column(name = "dataLimiteExec")
	private String dataLimiteExec;
	
	@NotNull
	@NotBlank
	@Column(name = "detalhesTarefa")
	private String detalhesTarefa;
	
	@NotNull
	@NotBlank
	@Column(name = "statusTarefa")
	private String statusTarefa;
	
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getdataLimiteExec() {
		return dataLimiteExec;
	}
	
	public void setdataLimiteExec(String dataLimiteExec) {
		this.dataLimiteExec = dataLimiteExec;
	}
	
	public String getdetalhesTarefa() {
		return detalhesTarefa;
	}
	
	public void setdetalhesTarefa(String detalhesTarefa) {
		this.detalhesTarefa = detalhesTarefa;
	}
	
	public String getstatusTarefa() {
		return statusTarefa;
	}
	
	public void setstatusTarefa(String statusTarefa) {
		this.statusTarefa = statusTarefa;
	}
}
