package kosta.model.dto;

public class ProductDTO {
	private String productCode;
	private String productName;
	private int sellPrice;
	private String description;
	private int readnum ;
	private String fName;
	
	public ProductDTO() {	}
	
	public ProductDTO(String productCode, String productName, int sellPrice, String description, int readnum,
			String fName) {
		this.productCode = productCode;
		this.productName = productName;
		this.sellPrice = sellPrice;
		this.description = description;
		this.readnum = readnum;
		this.fName = fName;
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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getReadnum() {
		return readnum;
	}
	public void setReadnum(int readnum) {
		this.readnum = readnum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	
}
