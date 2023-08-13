package June;

public class Student_Division {
    public static void main(String[] a){
        float percentage = 56;

        if(percentage >= 65){
            System.out.println("First Division");
        }else if((percentage >= 55) &&(percentage < 65)){
            System.out.println("Second Division");
        }else if(percentage < 55){
            System.out.println("Third Division");
        }
    }
}
