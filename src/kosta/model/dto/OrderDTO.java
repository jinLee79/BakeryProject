package kosta.model.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
	
	private int orderNo; //주문번호
	private String userId; //주문한 회원Id
	private String orderDate; //주문일자
	private String receivingDate; //예상수령일
	private int orderTotal;  //주문총금액
	private String orderState; //주문상태
	
	private List<OrderDetailsDTO> orderDetailList = new ArrayList<>();
	
	public OrderDTO() {	}

	public OrderDTO(int orderNo, String userId, String orderDate, String receivingDate, int orderTotal,
			String orderState) {
		this.orderNo = orderNo;
		this.userId = userId;
		this.orderDate = orderDate;
		this.receivingDate = receivingDate;
		this.orderTotal = orderTotal;
		this.orderState = orderState;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getReceivingDate() {
		return receivingDate;
	}

	public void setReceivingDate(String receivingDate) {
		this.receivingDate = receivingDate;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public List<OrderDetailsDTO> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailsDTO> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	
}
