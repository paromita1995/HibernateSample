package product;

public class ProductModel {
	private int id;
	public String ProductName;
	public int Price;
	public String Decp;
	public int Quant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getDecp() {
		return Decp;
	}
	public void setDecp(String decp) {
		Decp = decp;
	}
	public int getQuant() {
		return Quant;
	}
	public void setQuant(int quant) {
		Quant = quant;
	}
	
	

}
