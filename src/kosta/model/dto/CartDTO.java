package kosta.model.dto;

public class CartDTO {
	private String productCode;
	private String productName;
	private int sellPrice;
	private int quantity;

	public CartDTO() {	}
	public CartDTO(String productCode, String productName, int sellPrice, int quantity) {
		this.productCode = productCode;
		this.productName = productName;
		this.sellPrice = sellPrice;
		this.quantity = quantity;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
