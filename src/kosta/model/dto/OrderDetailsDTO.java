package kosta.model.dto;

public class OrderDetailsDTO {
	private String detailNo;  //주문상세번호
	private String orderNo;
	private String productCode; 
	private int quantity;
	private int sellPrice;
	
	public OrderDetailsDTO() {}

	public OrderDetailsDTO(String detailNo, String orderNo, String productCode, int quantity, int sellPrice) {
		this.detailNo = detailNo;
		this.orderNo = orderNo;
		this.productCode = productCode;
		this.quantity = quantity;
		this.sellPrice = sellPrice;
	}

	public String getDetailNo() {
		return detailNo;
	}
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
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
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}


}
