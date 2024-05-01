package sortData;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int empNumber;
    private String name;
    private String salary;
    private String department;

    public Employee(int empNumber, String name, String salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getEmpNumber() == employee.getEmpNumber() && Objects.equals(getName(), employee.getName()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpNumber(), getName(), getSalary(), getDepartment());
    }

    @Override
    public int compareTo(Employee o) {
        if (this.empNumber>o.empNumber){
            return -1;
        }else if(this.empNumber<o.empNumber){
            return 1;
        }else return 0;
    }
}
