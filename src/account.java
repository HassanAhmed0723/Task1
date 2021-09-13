import java.util.Scanner;
public class account {
	
	public
	String name;
	String adress;
	int ph_number;
	int uniq_accnum;
	int balance;
	Scanner myObj = new Scanner(System.in);

	 void getval() {
		
		System.out.println("Enter Your Name: ");
		String name = myObj.nextLine();
		System.out.println("Enter Your Adress: ");
		String adress = myObj.nextLine();
		System.out.println("Enter Your Phone Number: ");
		int ph_number = myObj.nextInt();
		System.out.println("Enter Your Unique Account Number: ");
		int uniq_accnum = myObj.nextInt();
		System.out.println("Enter Your Balance: ");
		int balance = myObj.nextInt();
		System.out.println("Your Account has been created Successfully !!");
		
		System.out.println("Name: " + name);
		System.out.println("Adress: " + adress);
		System.out.println("Phone Number: " + ph_number);
		System.out.println("Unique Account Number: " + uniq_accnum);
		System.out.println("Current Balance: " + balance);
		
	 }
	 
	 
	 static void check_Unum(String name, String adress, int ph_number, int balance)
	 {
		 
		 Scanner myObj3 = new Scanner(System.in);
		 
		 System.out.println("Enter The Unique Account Number: ");
		 int unum = myObj3.nextInt();
		 if (unum == 111)
		 {
			 System.out.println("Access Granted !!");
			 System.out.println("Name: " + name);
			 System.out.println("Adress: " + adress);
			 System.out.println("Phone Number: " + ph_number);
			 System.out.println("Current Balance: " + balance);
		 }
		 
		 
	 }

}
