public class arithmeticOperator{
    public static void main(String[] args){
        int A = 5;
        int B = 11;

        int sum = A + B; 
        int difference = A - B;
        int product = A * B;
        double qoutient = (double)  B / A;
        int remainder = B % A;

        System.out.println("Sum of 2 numbers is: " + sum);
        System.out.println("Difference of 2 numbers is: " + difference);
        System.out.println("Product of 2 numbers is: " + product);
        System.out.println("Quotient of 2 numbers is: " + qoutient);
        System.out.println("Remainder of 2 numbers is: " + remainder);

    }
}