public class scholarshipEligibility {
    public static void main(String[] args) {
        
        int enrolleredCredits = 12;
        double gwa = 1.75;
        boolean hasDisciplinaryActions = false;
        boolean isClubMember = false;
                   
        if((enrolleredCredits >=12) && (gwa <= 1.5) && (hasDisciplinaryActions == false)
           
        || (gwa >=1.75 && gwa <= 2.0 && isClubMember == true) 
        ) {
            System.out.println("Yuan is Eligible for scholarship");
        }
        else{
            System.out.println("Yuan is NOT Eligible for scholarship");

        }
    }
}