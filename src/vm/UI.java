package vm;

public class UI {

	public static void topView(){
		System.out.println("\n------------------[ Vending Machine ]------------------\n ");
	}
	public static void bottomView(){
		System.out.println("------------------------------------------------------- ");
		System.out.printf("※ 1회 최대 입금가능액: 1000원, 10원 단위이상 가능\n");
	}
	public static void nameView(Drink drink1, Drink drink2, Drink drink3){
		System.out.printf("  %-17s %-17s %-13s\n",drink1.getDrinkName(),drink2.getDrinkName(),drink3.getDrinkName());
		
		if(drink1.getStock() > 0){
			System.out.printf("  %12d원",drink1.getDrinkPrice());
		}	
		else if(drink1.getStock() <= 0){
			drink1.setStock(0);
			System.out.printf("  %-13s","매진");	
		}
		if(drink2.getStock() > 0){
			System.out.printf(" %16d원",drink2.getDrinkPrice());
		}
		else if(drink2.getStock() <= 0){
			drink2.setStock(0);
			System.out.printf("  %-16s","매진");	
		}	
		if((drink3.getStock() > 0))
			System.out.printf(" %16d원\n\n",drink3.getDrinkPrice());
		else if(drink3.getStock() <= 0){
			drink3.setStock(0);
			System.out.printf("  %16s\n\n","매진");	
		}
	}
	public static void depositView(Money money){
		System.out.printf("\t\t\t\t요구 금액: %6d 원\n",money.getPrice());
		System.out.printf("\t\t\t\t현재 금액: %6d 원\n",money.getDeposit());
	}	
	public static void changeView(Money money){
		
		int remain = money.getChange();
		
		if(remain < 0)
			remain *= -1;
		else if(remain ==0){ }
		else{
			System.out.printf("\n ** 거스름돈 :  총 %d원 ** ",remain);
			if(remain/500 != 0){
				System.out.printf("\n * 500원 * %d 개",remain/500);
				remain %= 500;
			}
			if(remain/100 !=0){
				System.out.printf("\n * 100원 * %d 개",remain/100);
				remain %= 100;
			}
			if(remain/50 !=0){
				System.out.printf("\n * 50원 * %d 개",remain/50);
				remain %= 50;
			}
			if(remain/10 !=0){
				System.out.printf("\n * 10원 * %d 개 ",remain/10);
			}
		}		
	}
}
