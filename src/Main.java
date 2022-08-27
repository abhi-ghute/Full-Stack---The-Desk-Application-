import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Integer> expenses = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
     
        System.out.println("\nEnter your choice:\t");

        int  options =  sc.nextInt();
		switch (options) {
			case 1:
				System.out.println("Your saved expenses are listed below: \n");
				System.out.println(expenses + "\n");
				optionsSelection();
				break;
			case 2:
				System.out.println("Enter the value to add your Expense: \n");
				int value = sc.nextInt();
				expenses.add(value);
				System.out.println("Your value is updated\n");
				System.out.println(expenses + "\n");
				optionsSelection();
	
				break;
			case 3:
				System.out.println(
						"You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
				int con_choice = sc.nextInt();
				if (con_choice == options) {
					expenses.clear();
					System.out.println(expenses + "\n");
					System.out.println("All your expenses are erased!\n");
				} else {
					System.out.println("Oops... try again!");
				}
				optionsSelection();
				break;
			case 4:
				sortExpenses(expenses);
				optionsSelection();
				break;
			case 5:
				searchExpenses(expenses);
				optionsSelection();
				break;
			case 6:
				closeApp();
				break;
			default:
				System.out.println("You have made an invalid choice!");
				optionsSelection();
				break;
       }
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        System.out.println(arrayList);
        System.out.println("Enter the expense you need to search:\t");
        int searchExpence = sc.nextInt();
        
        int position = arrayList.indexOf(searchExpence);
        
        if(position==-1)
        	System.out.println("Entered expence is not present in the list..");
        else
        	System.out.println("Entered Index present in the list at "+position+" index");
        
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
       
       System.out.println("Your saved expenses are listed below in default sorted order: \n");
       ArrayList<Integer> temp = new ArrayList<>();
       temp.addAll(arrayList);
       Collections.sort(temp);
       System.out.println(temp);
    }
}
