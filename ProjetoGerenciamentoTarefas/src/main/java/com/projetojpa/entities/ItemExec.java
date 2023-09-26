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
@Table(name = "itemexec")
public class ItemExec {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(name = "percentual")
	private double percentual;
	
	@NotNull
	@NotBlank
	@Column(name = "descricao")
	private String descricao;
	
	@NotNull
	@NotBlank
	@Column(name = "dataExec")
	private String dataExec;
	
	public Long getid() {
		return id;
	}
	
	public void setid(Long id) {
		this.id = id;
	}
	
	public double getpercentual() {
		return percentual;
	}
	
	public void setpercentual(double percentual) {
		this.percentual = percentual;
	}
	
	public String getdescricao() {
		return descricao;
	}
	
	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getdataExec() {
		return dataExec;
	}
	
	public void setdataExec(String dataExec) {
		this.dataExec = dataExec;
	}
}
