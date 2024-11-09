public class logicalOperators{
    public static void main (String [] args) {
        boolean A = true;
        boolean B = false;

        boolean and = A && B; 
        boolean or = A || B; 
        boolean not = !A;

        System.out.println("And: " + and);
        System.out.println("Or: " + or);
        System.out.println("Not: " + not);
    }
}