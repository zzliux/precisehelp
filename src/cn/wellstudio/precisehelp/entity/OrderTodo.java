package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * OrderTodo entity. @author MyEclipse Persistence Tools
 */

public class OrderTodo implements java.io.Serializable {

	// Fields

	private Integer ordertodoId;
	private Users users;
	private Goodsinfo goodsinfo;
	private String orderNumber;
	private String orderPs;
	private Date orderTime;

	// Constructors

	/** default constructor */
	public OrderTodo() {
	}

	/** full constructor */
	public OrderTodo(Users users, Goodsinfo goodsinfo, String orderNumber,
			String orderPs, Date orderTime) {
		this.users = users;
		this.goodsinfo = goodsinfo;
		this.orderNumber = orderNumber;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
	}

	// Property accessors

	public Integer getOrdertodoId() {
		return this.ordertodoId;
	}

	public void setOrdertodoId(Integer ordertodoId) {
		this.ordertodoId = ordertodoId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderPs() {
		return this.orderPs;
	}

	public void setOrderPs(String orderPs) {
		this.orderPs = orderPs;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

}