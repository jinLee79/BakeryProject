package kosta.model.dto;

public class OrderDetailsDTO {
	private int orderNo;
	private String productCode; 
	private int quantity;
	
	public OrderDetailsDTO() {}
	
	public OrderDetailsDTO(String productCode, int quantity) {
		this.productCode = productCode;
		this.quantity = quantity;
	}
	public OrderDetailsDTO(int orderNo, String productCode, int quantity) {
		this(productCode, quantity);
		this.orderNo = orderNo;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
