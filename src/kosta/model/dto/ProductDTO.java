package kosta.model.dto;

public class ProductDTO {
	private String productCode;
	private String productName;
	private int sellPrice;
	private String description;
	private String fName;
	
	public ProductDTO(){}
	public ProductDTO(String productCode, String productName, int sellPrice, String description, String fName)
	{
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.sellPrice = sellPrice;
		this.description = description;
		this.fName = fName;
	}
	
	public String getProductCode()
	{
		return productCode;
	}
	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public int getSellPrice()
	{
		return sellPrice;
	}
	public void setSellPrice(int sellPrice)
	{
		this.sellPrice = sellPrice;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getfName()
	{
		return fName;
	}
	public void setfName(String fName)
	{
		this.fName = fName;
	}
}
