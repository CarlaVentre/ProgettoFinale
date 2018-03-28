package com.mcs.be.course.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CartEntryDto implements Serializable {
	
	private Long idCarrello;
	private Long idArticolo;
	private int quantity;
	private BigDecimal prezzoUnitario;	
	
	public CartEntryDto() {
	}

	public CartEntryDto(Long idCarrello, Long idArticolo, int quantity, BigDecimal prezzoUnitario) {
		super();
		this.idCarrello = idCarrello;
		this.idArticolo = idArticolo;
		this.quantity = quantity;
		this.prezzoUnitario = prezzoUnitario;
	}

	public Long getIdCarrello() {
		return idCarrello;
	}

	public void setIdCarrello(Long idCarrello) {
		this.idCarrello = idCarrello;
	}

	public Long getIdArticolo() {
		return idArticolo;
	}

	public void setIdArticolo(Long idArticolo) {
		this.idArticolo = idArticolo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	
	
	
	

}
