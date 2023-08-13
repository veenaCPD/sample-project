package July;

public class employee {
        String EmpID;
        String empName;
        private String DOB ;
        String dept;
        String address1;
        String phoneNo;
        String emailId;

        employee (String employeeID, String eName){
                EmpID = employeeID;
                empName = eName;
        }

            public void setAddress (String address){
                address1 = address;
            }

            public void getAddress (){
                System.out.println ("Address = " + address1);
            }
}
