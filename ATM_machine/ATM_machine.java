import java.util.Scanner;
class  ATM_machine
{
    public float amount=0;
    public void menu()
    {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(" 1. Check Balance\n 2. Withdraw money\n 3. Deposite money\n 4. Exit");
            
            System.out.println();

            System.out.print("Enter your choice:");
            System.out.println();

            Scanner input=new Scanner(System.in);
            int choice=input.nextInt();
            
            switch(choice)
            {
               case 1: checkBalance();
               break;

               case 2: withdraw();  
               break;
              
               case 3: deposite();
               break;

               case 4: System.out.println("Exiting....Thank You");
               break;

               default:System.out.println("Invalid choice, please try again.");
               menu();
               break;
            }
    }

    public void checkBalance()
    {
      System.out.println("Your balance is "+amount);
      menu();
    }

    public void withdraw()
    {
      System.out.print("Enter amount to withdraw:");
      Scanner input=new Scanner(System.in);
      int withdrawAmount=input.nextInt();

      if(withdrawAmount>amount){
        System.out.println("Insufficient amount");
        menu();
      }
      else{
        amount=amount-withdrawAmount;     
        System.out.println("You have successfully withdrawn.");
        menu();
      }
    }

    public void deposite()
    {
     System.out.print("Enter amount to deposit:");
     Scanner input=new Scanner(System.in);
     int depositeAmount=input.nextInt();

     amount=amount+depositeAmount;
     System.out.println("You have successfully deposited.");
     menu();
    }


    public static void main(String[] args)
    {

        int PIN=5764;
        

         System.out.println("Enter your PIN");
         Scanner input=new Scanner(System.in);
        int userPIN=input.nextInt();

        if(userPIN==PIN)
        {
            ATM_machine obj=new ATM_machine();
            obj.menu();
        }

        else
        {
          System.out.println("Incorrect Password");
        }
        

    }
}