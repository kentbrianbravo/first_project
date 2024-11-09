public class relationalOperators{
    public static void main(String[] args){
        int Brylle = 1;
        int Reign = 13;
        int Jhaystine = 29;
        int Yuan = 30;

        boolean equals = Reign == Jhaystine;
        boolean notEqual = Brylle !=  Reign;
        boolean greaterThan = Jhaystine > Reign;
        boolean lessThan = Yuan < Jhaystine;
        boolean lessThanOrEqual = Yuan <= Jhaystine;
        boolean greaterThanOrEqual = Jhaystine >= Jhaystine; 

        System.out.println("are Reign and Jhaystine equal?: " + equals);
        System.out.println("are Brylle and Reign Not equal?: " + notEqual);
        System.out.println("is Jhaystine greater than Reign?: " + greaterThan);
         System.out.println("is Yuan less than Jhaystine?: " + lessThan);
         System.out.println("is Yuan less than or equal to Jhaystine?: " + lessThanOrEqual);
          System.out.println("is Jhaystine greater than or equal to Brylle?: " + greaterThanOrEqual);
    }
}