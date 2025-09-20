package DesignProxy;

public class EmployeeDeoImpl implements EmployeeDao {
    @Override
   public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println(("Created new row in theEMployee table"));
    }
    @Override
    public void delete(String client, int EmployeeId)throws Exception {
        System.out.println("delete row with employeeId"+ EmployeeId);
    }
    @Override
    public EmployeeDo get(String client, int employeeId)throws exception {
        System.out.println("fectching data from the DB");
        retrun new EmployeeDo();
    }
}
