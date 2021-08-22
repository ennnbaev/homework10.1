package com.company;

public class Employee implements Comparable<Employee> {
    String firstName;
    String lastName;
    int salary;
    int id;
    static int count=0;

    Employee(String firstName,String lastName,int salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
       id=count++;

    }

    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return id-o.id;
    }
}
