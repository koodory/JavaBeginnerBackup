package vm;

public class Drink {
	private String drinkName;
	private int drinkPrice, stock;
	
	public Drink(){
		
	}
	public Drink(String drinkName, int drinkPrice, int stock) {
		super();
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
		this.stock = stock;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
	public int getDrinkPrice() {
		return drinkPrice;
	}
	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int removeStock(){
		this.stock--;
		return stock;
	}
	public int recoverStock(){
		this.stock++;
		return stock;
	}
	public static void main(String[] args){
		Drink test = new Drink();
		System.out.println(test);
		
	}
	@Override
	public String toString() {
		return "Drink [drinkName=" + drinkName + ", drinkPrice=" + drinkPrice
				+ ", stock=" + stock + "]";
	}
}
