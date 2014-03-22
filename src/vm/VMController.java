package vm;

import java.util.Scanner;

public class VMController {
	
	int flag = 0; //errorüũ �÷���
	
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
			System.out.printf("\n  �� ���� ���� [0:��� ����] : ");
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
					System.out.printf("\n ** ������ ���� %s�� ��� �����ϴ�. **\n", bev.getDrinkName());
					exit = 1;
				}
				if(exit == 0)
					break;
			}else{
				exit = 1;
				System.out.println("\n ** �Է� ����. �ٽ� �Ա����ּ���**");
			}
		}
	}
	public void insertCoin(Drink[] drink, Money money, Drink bev){
		Scanner scan = new Scanner(System.in);
		if(flag==1)
			return;
		while(true){
			System.out.printf("\n  �� �Ա����ּ��� [0:�Ա� ����] : ");
			int amount = scan.nextInt();
			int max = money.getDeposit();
			if( amount > 0 && amount <= 1000 && amount %10 == 0 )// ���� �ݾ� �Ա�
				money.total(amount); //�Ա�
			money.setChange(money.getDeposit()-money.getPrice());
			
			for (int i=0; i<25; i++) System.out.println();
			viewMenu(drink,money);
			
			if(amount > 0 && amount <= 1000 && amount %10 == 0){
				if(money.getDeposit() >= money.getPrice()){
					break;
				}
			}else{ //���� �ʰ�
			 if( amount == 0 || max >= 2000){ //���� �Ǵ� �ݾ��ʰ�
		    	if(max >= 2000)
		    		System.out.println("\n ** ���̻� �Ա��� �� �����ϴ�.**");
		    	if( amount == 0 && bev.getDrinkName() != null)
		    	{
		    		flag = 1;
		    		for(int i=0;i<12;i++) //���� ������ ����� ��� ��� ����
		    		{
		    			if(bev.getDrinkName() == drink[i].getDrinkName())
		    				drink[i].recoverStock(); 
		    		}
		    		break;
		    	}
			 }
			 System.out.println("\n ** �Է� ������ �ʰ��Ͽ����ϴ�.**");
			}
		}
	}
	public void showResult(Money money, Drink bev){
		UI ui = new UI();
		if(flag == 1)
		{
			System.out.println("\n [ ������ ����մϴ�. ]");
			if(money.getChange() < 0) // ���� �ݾ� �Է��� ���
				System.out.printf(" ** �Ա��� %d �� ���� ��ȯ. **", money.getDeposit());
		}else{
			System.out.printf("\n[ %s��(��) ���Խ��ϴ�. ]",bev.getDrinkName());
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
		drink[5] = new Drink("06. ��Ű��",700,2);
		drink[6] = new Drink("07. ���Ǵ�",1200,10);
		drink[7] = new Drink("08. �Ƿ�Ƽ",1200,10);
		drink[8] = new Drink("09. ��Ÿ500",1500,20);
		drink[9] = new Drink("10. �׽�ī��",1300,15);
		drink[10] = new Drink("11. ������",1200,5);
		drink[11] = new Drink("12. ��ī��",1500,5);
		VMController controller = new VMController();
		Money money = new Money(0,0,0);
		
		while(true){
			Drink beverage = new Drink();
			controller.viewMenu(drink,money);
			controller.inputMenu(drink,money,beverage);
			controller.insertCoin(drink,money,beverage);
			controller.showResult(money,beverage);
			System.out.printf("\n\n  �� ��� �Ͻðڽ��ϱ� (0:����) :");
			Scanner scan = new Scanner(System.in);
			if(scan.nextInt()==0)
			{
				System.out.println("\n\t*** ���α׷��� �����մϴ�! ***");
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
