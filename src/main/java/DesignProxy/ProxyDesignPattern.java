package DesignProxy;

public class ProxyDesignPattern {
public static void main(String args[]){
    try {
        EmployeeDao empTableObj = new EmployeeDaoProxy();
        empTableObj.create("USER", new EmployeeDo());
        System.out.println("operation suces  sfull");
    }
    catch(Exception e) {
        System.out.println(e.getMessage());
    }
}

