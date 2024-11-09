public class fullScholarshipEligibility {
    public static void main(String[] args) {
        
        int enrolleredCredits = 20;
        double gwa = 1.99;
        boolean hasDisciplinaryActions = false;
        boolean isClubMember = true;
              
        if(enrolleredCredits >= 12 && gwa <=1.25 && hasDisciplinaryActions == false){
            System.out.println("Ferdinando is Eligible for Full scholarship");
        }
        else if(enrolleredCredits >= 12 && gwa >= 1.26 && gwa <= 1.75 && hasDisciplinaryActions == false){
            System.out.println("Ferdinando is Eligible for Partial scholarship");
        }                        
                                                                                                                                   
        else if(enrolleredCredits >= 12 && gwa >= 1.76 && gwa <= 2.0 && hasDisciplinaryActions == false && isClubMember == true){
            System.out.println("Ferdinando is Eligible for Conditional scholarship");
        }
        else {
            System.out.println("Ferdinando is NOT Eligible for scholarship");
        }
    }
}