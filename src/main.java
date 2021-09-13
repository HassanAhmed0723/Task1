import java.util.Scanner;


public class main {
	
	int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj1 = new Scanner(System.in);
		
		System.out.println("----Welcome to the Account Management System");
		System.out.println("Press 1 to Open an Account");
		System.out.println("Press 2 to Access your Account");
		System.out.println("Press 3 to View Details");
		
		int choice = myObj1.nextInt();
		
		if (choice == 1)
		{
			account e1 = new account();
			e1.getval();
		}
		else if (choice == 2)
		{
			account e1 = new account();
			account.check_Unum("John","House 4 Street 23",555243,5000);
		}

	}

}
