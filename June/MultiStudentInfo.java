package June;

public class MultiStudentInfo {
    public static void main(String [] a){

        String [][]student = new String[5][5];

        student[0][0] = "Priya";
        student[0][1] = "Grade 8";
        student[0][2] = "B";
        student[0][3] = "DYPIS";
        student[0][4] = "Pune";

        student[1][0] = "Prashant";
        student[1][1] = "Grade 3";
        student[1][2] = "A";
        student[1][3] = "DYPIS";
        student[1][4] = "Nasik";


        for(int i = 0 ; i <= 1 ; i++){
            for(int j = 0 ; j < 5 ; j++) {
                System.out.println(student[i][j]);
            }
        }
    }
}
