import java.util.Scanner;

public class userRegistration{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        byte age = sc.nextByte();

        System.out.println("Enter your height(cm)");
        float height = sc.nextFloat();

        System.out.println("Do you agree to the terms and conditions? (true/false)");
        boolean terms = sc.nextBoolean();


        System.out.println("\n------ Registration Information-------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Agreed to terms: " + terms);

        if(terms){
            System.out.println("Registration is successful");
        }else{
            System.out.println("Registration is failed, you must agree to the terms and condition");
        }


    } 
}