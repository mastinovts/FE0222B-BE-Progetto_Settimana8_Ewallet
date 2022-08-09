package com.banca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class ContoCorrente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date dataCreazione;
	
	@Column(unique = true, nullable = false)
	private Long iban;	
	private String intestatario;
	//private List <String> listaMovimenti = new ArrayList <String>();
	private double saldo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Long getIban() {
		return iban;
	}

	public void setIban(Long iban) {
		this.iban = iban;
	}

	public String getIntestatario() {
		return intestatario;
	}

	public void setIntestatario(String intestatario) {
		this.intestatario = intestatario;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
