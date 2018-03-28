package com.mcs.be.course.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table
@IdClass(CartEntryId.class)
public class CartEntry implements Serializable {
	
	@Id
	@Column(nullable=false)
	private Long cartId;
	
	@Id
	@Column(nullable = false)
	private Long articleId;
	
	@Column
	@Min(value=1)
	private int quantity;
	
	@Column
	private BigDecimal unitPrice;

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
