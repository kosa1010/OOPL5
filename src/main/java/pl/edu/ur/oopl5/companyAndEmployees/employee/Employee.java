package pl.edu.ur.oopl5.companyAndEmployees.employee;


import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractPerson;

/**
 */
public class Employee extends AbstractPerson implements EmployeeInterface {

    public Employee(String name, String surname, int age, String position) {
        super(name, surname, age);
    }

    public String getPosition() {
        return null;
    }

    public void setPosition() {

    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }

    public String getSurname() {
        return null;
    }

    public void setSurname(String surname) {

    }

    public int getAge() {
        return 0;
    }

    public void setAge(int age) {

    }
}