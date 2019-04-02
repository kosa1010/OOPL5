package pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses;


import pl.edu.ur.oopl5.companyAndEmployees.employee.Employee;

/**
 */
public abstract class AbstractCompany {


    public AbstractCompany(int n) {
    }

    public abstract void addEmployee(Employee e);
    public abstract Employee[] getEmployees();
    public abstract void printEmployees();
}
