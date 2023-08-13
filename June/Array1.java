package June;

public class Array1 {
    public static void main(String [] a){

        int []age = new int[5];

        for(int i = 1 ; i <=5 ; i++){
            age[i-1] = i;
        }
        age[3] = 90;
        for(int i = 1 ; i <=5 ; i++){
            System.out.println(age[i-1]);
        }


    }
}
