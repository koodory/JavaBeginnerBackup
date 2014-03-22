package vm;

public class Money {
	private int change,deposit,price;

	public Money(){
		
	}
	public Money(int deposit, int change, int price) {
		super();
		this.deposit = deposit;
		this.change = change;
		this.price = price;
	}
	
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	public void total(int deposit){
		this.deposit += deposit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Money test = new Money();
		System.out.println(test);
	}
	@Override
	public String toString() {
		return "Money [deposit=" + deposit + ", change=" + change + ",price=" + price + "]";
	}
}
