

public class TwoDArrayFillTest {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        //  1 , 1, 1, 1, 1
        // 0 ,0, 0, 0, 0
        //  1 , 1, 1, 1, 1
        // 0 ,0, 0, 0, 0
        //  1 , 1, 1, 1, 1

        int no = 0;


        for(int i = 1 ; i <= 5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                if (i % 2 == 0){
                    no = 0;
                }else {
                    no = 1;
                }
                arr [i-1][j] = no;
            }
        }

        for(int i = 0 ; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }

    }
}
