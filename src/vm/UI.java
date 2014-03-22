package vm;

public class UI {

	public static void topView(){
		System.out.println("\n------------------[ Vending Machine ]------------------\n ");
	}
	public static void bottomView(){
		System.out.println("------------------------------------------------------- ");
		System.out.printf("�� 1ȸ �ִ� �Աݰ��ɾ�: 1000��, 10�� �����̻� ����\n");
	}
	public static void nameView(Drink drink1, Drink drink2, Drink drink3){
		System.out.printf("  %-17s %-17s %-13s\n",drink1.getDrinkName(),drink2.getDrinkName(),drink3.getDrinkName());
		
		if(drink1.getStock() > 0){
			System.out.printf("  %12d��",drink1.getDrinkPrice());
		}	
		else if(drink1.getStock() <= 0){
			drink1.setStock(0);
			System.out.printf("  %-13s","����");	
		}
		if(drink2.getStock() > 0){
			System.out.printf(" %16d��",drink2.getDrinkPrice());
		}
		else if(drink2.getStock() <= 0){
			drink2.setStock(0);
			System.out.printf("  %-16s","����");	
		}	
		if((drink3.getStock() > 0))
			System.out.printf(" %16d��\n\n",drink3.getDrinkPrice());
		else if(drink3.getStock() <= 0){
			drink3.setStock(0);
			System.out.printf("  %16s\n\n","����");	
		}
	}
	public static void depositView(Money money){
		System.out.printf("\t\t\t\t�䱸 �ݾ�: %6d ��\n",money.getPrice());
		System.out.printf("\t\t\t\t���� �ݾ�: %6d ��\n",money.getDeposit());
	}	
	public static void changeView(Money money){
		
		int remain = money.getChange();
		
		if(remain < 0)
			remain *= -1;
		else if(remain ==0){ }
		else{
			System.out.printf("\n ** �Ž����� :  �� %d�� ** ",remain);
			if(remain/500 != 0){
				System.out.printf("\n * 500�� * %d ��",remain/500);
				remain %= 500;
			}
			if(remain/100 !=0){
				System.out.printf("\n * 100�� * %d ��",remain/100);
				remain %= 100;
			}
			if(remain/50 !=0){
				System.out.printf("\n * 50�� * %d ��",remain/50);
				remain %= 50;
			}
			if(remain/10 !=0){
				System.out.printf("\n * 10�� * %d �� ",remain/10);
			}
		}		
	}
}
