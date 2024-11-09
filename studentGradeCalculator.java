public class studentGradeCalculator {
    public static void main(String[] args){

        int quizScore = 100;
        int examScore = 100;

        if(quizScore < 0 || quizScore > 100  ||  examScore < 0 || examScore > 100){
            System.out.println("Invalid score");
        }
        else{
            double finalGrade =  (quizScore * 0.4) + (examScore * 0.6);
            System.out.println("Final Grade: " + finalGrade);
        }

        
    }
}