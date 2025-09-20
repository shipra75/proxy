package DesignProxy;

public class EmployeeDaeProxy implements EmployeeDao{
    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy() {
        employeeDaoObj = new EmployeeDaoImpl();
    }
    @Override
    public void create (String client, EmployeeDo obj ) throws Exception {
        if(client.equals("ADMIN"))
        {
            employeeDaoObj.create(client,obj);
            return;
        }
        throw new Exception("Acess Denied");
    }
    @Override
    public void delete( String client, int employeeId)throws Exception {
        if(client.equals("ADMIN")) {
            employeeDaoObj.delete(client,employeeId);
            return;
        }
        throw new Exception("Acess Denies");
    }
    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception  {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDaoObj.get(client,employeeId);
        }
        throw new Exception("Access Denied");
    }
}
