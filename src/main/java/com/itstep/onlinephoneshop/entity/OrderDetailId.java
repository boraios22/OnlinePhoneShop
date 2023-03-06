package com.itstep.onlinephoneshop.entity;
// Generated Feb 27, 2023, 7:24:11 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderDetailId generated by hbm2java
 */
@Embeddable
public class OrderDetailId implements java.io.Serializable {

	private Integer orderId;
	private Integer phoneId;
	private int quantity;
	private float subtotal;

	public OrderDetailId() {
	}

	public OrderDetailId(int quantity, float subtotal) {
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public OrderDetailId(Integer orderId, Integer phoneId, int quantity, float subtotal) {
		this.orderId = orderId;
		this.phoneId = phoneId;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	@Column(name = "order_id")
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "phone_id")
	public Integer getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "subtotal", nullable = false, precision = 12, scale = 0)
	public float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailId))
			return false;
		OrderDetailId castOther = (OrderDetailId) other;

		return ((this.getOrderId() == castOther.getOrderId()) || (this.getOrderId() != null
				&& castOther.getOrderId() != null && this.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getPhoneId() == castOther.getPhoneId()) || (this.getPhoneId() != null
						&& castOther.getPhoneId() != null && this.getPhoneId().equals(castOther.getPhoneId())))
				&& (this.getQuantity() == castOther.getQuantity()) && (this.getSubtotal() == castOther.getSubtotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37 * result + (getPhoneId() == null ? 0 : this.getPhoneId().hashCode());
		result = 37 * result + this.getQuantity();
		result = 37 * result + (int) this.getSubtotal();
		return result;
	}

}