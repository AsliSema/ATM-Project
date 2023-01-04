import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
	
		int right = 3;
		int selectedNumber;
		int balance = 2700;
		
		while(right>0) {
			System.out.print("Enter user name: ");
			String name = scanner.nextLine();
			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			
			if(name.equals("asli") && password.equals("123asli")) {
				System.out.println("You are logged in the system. Welcome to X Bank.");
				do {
					System.out.println("1-Deposit\n" +
					"2-Withdrow Money\n" +
					"3-Balance Inquiry\n"+
					"4-Logout");
					System.out.println();
					System.out.print("Please select the action you want to: ");
					selectedNumber = scanner.nextInt();
					if(selectedNumber==1) {
						System.out.print("Amount of money you want to deposit: ");
						int price = scanner.nextInt();
						balance += price;
						System.out.println("Your new balance is: " + balance);
					}else if(selectedNumber ==2) {
						System.out.print("The amount of money you want to withdraw: ");
						int price = scanner.nextInt();
						if(price > balance) {
							System.out.println("You haven't enough money to withdraw.Please enter a valid price.");
						}else {
							balance -= price;
							System.out.println("Your new balance is: " + balance);
						}
					}else if(selectedNumber == 3) {
						System.out.println("Your balance is " + balance);
					} 
				}while(selectedNumber != 4);
				System.out.println("See you again.");
				break;
			}else {
				right--;
				if(right == 0) {
					System.out.println("Your account has been locked!");
				}else {
					System.out.println("Wrong password or name. Try again.");
					System.out.println("Remaining right is " + right);
				}
			}
			
		}
	}
}
