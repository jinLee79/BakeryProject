package kosta.model.dto;

public class OrderDTO {
	
	private String orderNo; //주문번호
	private String code;  //상품코드
	private String userId; //주문한 회원Id
	private int quantity;  //상품개수
	private String orderDate; //주문일자
	private int orderTotal;  //주문총금액
	private String orderStatus; //주문상태
	
	public OrderDTO() {	}

	public OrderDTO(String orderNo, String code, String userId, String orderDate, int quantity, int orderTotal,
			String orderStatus) {
		super();
		this.orderNo = orderNo;
		this.code = code;
		this.userId = userId;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.orderStatus = orderStatus;
	}

	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
