public class employeeBonusCalculator{
    public static void main (String []args){

        int performanceRating = 50;
        int yearsOfExperience = 1;
        int bonus = 0;


        if(performanceRating >= 90){
            bonus = 10000;
        }
        else if(performanceRating >= 70 && performanceRating <= 89){
            bonus = 5000;
        }
        else if(performanceRating >=50 && performanceRating <=69){
            bonus = 2500;
        }

        if(yearsOfExperience <= 2){
            bonus = bonus / 2;
        }

        System.out.println("The employee's bonus is: Php " + bonus);



    }
}