package kosta.model.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {
	
	private int orderNo; //�ֹ���ȣ
	private String userId; //�ֹ��� ȸ��Id
	private String orderDate; //�ֹ�����
	private String receivingDate; //���������
	private int orderTotal;  //�ֹ��ѱݾ�
	private String orderState; //�ֹ�����
	
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
