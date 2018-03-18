package com.vanhack.api.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7192931221920813708L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="client_name" , nullable = false )
	private String clientName;
	
	@Column(name="status" , nullable = true ) 
	private String status;
	
	
	@Column(name="listProducts" , nullable = false )
	private String listProducts;
	
	@Column(name="date_order" , nullable = false )
	private Date dateOrder;
	
	public Order() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getListProducts() {
		return listProducts;
	}

	public void setListProducts(String listProducts) {
		this.listProducts = listProducts;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", clientName=" + clientName + ", status=" + status + ", listProducts="
				+ listProducts + ", dateOrder=" + dateOrder + "]";
	} 
	

	
	
	
	
	
	
}
