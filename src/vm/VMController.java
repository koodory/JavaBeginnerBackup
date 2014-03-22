package vm;

import java.util.Scanner;

public class VMController {
	
	int flag = 0; //error체크 플래그
	
	public void viewMenu(Drink[] drink, Money money){
		UI ui = new UI();
		ui.topView();
		for(int i=0;i<=11;i=i+3)
			ui.nameView(drink[i],drink[i+1],drink[i+2]);
		ui.depositView(money);
		ui.bottomView();
	}
	public void inputMenu(Drink[] drink, Money money, Drink bev){
		flag = 0;
		Scanner scan = new Scanner(System.in);
		while(true){
			int exit = 0;
			System.out.printf("\n  ☞ 음료 선택 [0:사용 종료] : ");
			int i = scan.nextInt();
			
			if(i == 0)
			{
				flag = 1;
				break;
			}
			else if(i > 0 && i <= 12 )
			{
				bev.setDrinkName(drink[i-1].getDrinkName());
				bev.setDrinkPrice(drink[i-1].getDrinkPrice());
				drink[i-1].removeStock();
				money.setPrice(drink[i-1].getDrinkPrice());
				for (int j=0; j<25; j++) System.out.println();
				viewMenu(drink,money);
				if(drink[i-1].getStock()<=0)
				{
					System.out.printf("\n ** 선택한 음료 %s의 재고가 없습니다. **\n", bev.getDrinkName());
					exit = 1;
				}
				if(exit == 0)
					break;
			}else{
				exit = 1;
				System.out.println("\n ** 입력 오류. 다시 입금해주세요**");
			}
		}
	}
	public void insertCoin(Drink[] drink, Money money, Drink bev){
		Scanner scan = new Scanner(System.in);
		if(flag==1)
			return;
		while(true){
			System.out.printf("\n  ☞ 입금해주세요 [0:입급 종료] : ");
			int amount = scan.nextInt();
			int max = money.getDeposit();
			if( amount > 0 && amount <= 1000 && amount %10 == 0 )// 적정 금액 입금
				money.total(amount); //입금
			money.setChange(money.getDeposit()-money.getPrice());
			
			for (int i=0; i<25; i++) System.out.println();
			viewMenu(drink,money);
			
			if(amount > 0 && amount <= 1000 && amount %10 == 0){
				if(money.getDeposit() >= money.getPrice()){
					break;
				}
			}else{ //범위 초과
			 if( amount == 0 || max >= 2000){ //종료 또는 금액초과
		    	if(max >= 2000)
		    		System.out.println("\n ** 더이상 입금할 수 없습니다.**");
		    	if( amount == 0 && bev.getDrinkName() != null)
		    	{
		    		flag = 1;
		    		for(int i=0;i<12;i++) //음료 선택후 취소할 경우 재고량 복귀
		    		{
		    			if(bev.getDrinkName() == drink[i].getDrinkName())
		    				drink[i].recoverStock(); 
		    		}
		    		break;
		    	}
			 }
			 System.out.println("\n ** 입력 범위를 초과하였습니다.**");
			}
		}
	}
	public void showResult(Money money, Drink bev){
		UI ui = new UI();
		if(flag == 1)
		{
			System.out.println("\n [ 선택을 취소합니다. ]");
			if(money.getChange() < 0) // 적은 금액 입력후 취소
				System.out.printf(" ** 입금한 %d 원 전액 반환. **", money.getDeposit());
		}else{
			System.out.printf("\n[ %s가(이) 나왔습니다. ]",bev.getDrinkName());
			ui.changeView(money);
		}
		ui = null;
	}
	public static void main(String[] args) {
		Drink[] drink = new Drink[12];
		drink[0]= new Drink ("01. Coca_Cola",900,10);
		drink[1] = new Drink("02. Poweraid",1100,5);
		drink[2] = new Drink("03. Getoraid",1100,0);
		drink[3] = new Drink("04. HOT6",1500,10);
		drink[4] = new Drink("05. Pepsi_Cola",900,20);
		drink[5] = new Drink("06. 밀키스",700,2);
		drink[6] = new Drink("07. 솔의눈",1200,10);
		drink[7] = new Drink("08. 실론티",1200,10);
		drink[8] = new Drink("09. 비타500",1500,20);
		drink[9] = new Drink("10. 네스카페",1300,15);
		drink[10] = new Drink("11. 렛츠비",1200,5);
		drink[11] = new Drink("12. 포카리",1500,5);
		VMController controller = new VMController();
		Money money = new Money(0,0,0);
		
		while(true){
			Drink beverage = new Drink();
			controller.viewMenu(drink,money);
			controller.inputMenu(drink,money,beverage);
			controller.insertCoin(drink,money,beverage);
			controller.showResult(money,beverage);
			System.out.printf("\n\n  ☞ 계속 하시겠습니까 (0:종료) :");
			Scanner scan = new Scanner(System.in);
			if(scan.nextInt()==0)
			{
				System.out.println("\n\t*** 프로그램을 종료합니다! ***");
				break;
			}else{
				for (int i=0; i<25; i++) System.out.println();
				money.setPrice(0);
				money.setChange(0);
				money.setDeposit(0);
				beverage = null;
			}
		}
	}
}
