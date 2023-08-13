package June;

public class dbTesting {
    public boolean connectDB(){
        boolean bFlag = false;
        // bFlag = Find whether already connected
        if (bFlag == false) {
            // Connect to DB
        }

        return bFlag;
    }
    public String executeQuery (String sqlQuery){
        boolean bFlag = connectDB();
        if (bFlag == true){
            // Result print
        }else{
            System.out.println("DB is not connected");
        }
        String str = "";

        return str;
    }

    public static void main(String[] args) {
        dbTesting myObj = new dbTesting();
        myObj.executeQuery("Select * from Employee");
    }
}
