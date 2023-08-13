package June;

public class booleanTest {

    public static void main(String[] ab){
        int a = 15;
        int b = 15;
        String status = "Fail";
        String divison = "First";

        if((divison == "First")&&(status == "Pass")){
            System.out.println("Passed : First division");
        }else if((divison == "Second")&&(status == "Pass")){
            System.out.println("Passed : Second division");
        }else if((divison == "Third")&&(status == "Pass") ){
            System.out.println("Passed : Third division");
        }else{
            System.out.println("FAIL : Student is failed");
        }


//        char babyGender = 'F';
//        if(babyGender == 'M'){
//            System.out.println("It's baby boy !!!!");
//        }else{
//            System.out.println("It's baby girl !!!!");
//        }
    }
}
