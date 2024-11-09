public class bravoKent{
    public static void main(String[] args){

        int accountBalance = 5000;
        int withdrawalAmount = 4200;

        if(withdrawalAmount <=  accountBalance && withdrawalAmount % 100== 0){
            accountBalance -=  withdrawalAmount;
            System.out.println("Withdraw is successful, your new balance is: " +  accountBalance);
        }
        else{
            System.out.println("Error: Insufficient funds or invalid withdrawal amount");
        }

    }
}