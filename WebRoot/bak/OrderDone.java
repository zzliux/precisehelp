package cn.wellstudio.precisehelp.entity;

import java.util.Date;

/**
 * 完毕的订单
 * @author huhong
 *
 */
public class OrderDone implements java.io.Serializable {

	// Fields

	private Integer orderdoneId; // id
	private Users users; // 关联用户
	private Express express; // 关联物流
	private Admins admins; // 关联管理员
	private Goodsinfo goodsinfo; // 关联商品
	private String orderNum; // 订单编号
	private String orderPs; // 订单备注
	private Date orderTime; // 订单时间
	private String orderKcom; // 订单快递公司
	private String orderKnum; // 订单快递单号
	private Date orderDonetime; // 订单完成时间
	private Integer orderComment; // 订单是否已经评论( 0 尚未评价 1 已评价)

	// Constructors

	/** default constructor */
	public OrderDone() {
	}

	/** full constructor */
	public OrderDone(Users users, Express express, Admins admins,
			Goodsinfo goodsinfo, String orderNum, String orderPs,
			Date orderTime, String orderKcom, String orderKnum,
			Date orderDonetime, Integer orderComment) {
		this.users = users;
		this.express = express;
		this.admins = admins;
		this.goodsinfo = goodsinfo;
		this.orderNum = orderNum;
		this.orderPs = orderPs;
		this.orderTime = orderTime;
		this.orderKcom = orderKcom;
		this.orderKnum = orderKnum;
		this.orderDonetime = orderDonetime;
		this.orderComment = orderComment;
	}

	// Property accessors

	public Integer getOrderdoneId() {
		return this.orderdoneId;
	}

	public void setOrderdoneId(Integer orderdoneId) {
		this.orderdoneId = orderdoneId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Express getExpress() {
		return this.express;
	}

	public void setExpress(Express express) {
		this.express = express;
	}

	public Admins getAdmins() {
		return this.admins;
	}

	public void setAdmins(Admins admins) {
		this.admins = admins;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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

	public String getOrderKcom() {
		return this.orderKcom;
	}

	public void setOrderKcom(String orderKcom) {
		this.orderKcom = orderKcom;
	}

	public String getOrderKnum() {
		return this.orderKnum;
	}

	public void setOrderKnum(String orderKnum) {
		this.orderKnum = orderKnum;
	}

	public Date getOrderDonetime() {
		return this.orderDonetime;
	}

	public void setOrderDonetime(Date orderDonetime) {
		this.orderDonetime = orderDonetime;
	}

	public Integer getOrderComment() {
		return this.orderComment;
	}

	public void setOrderComment(Integer orderComment) {
		this.orderComment = orderComment;
	}

}