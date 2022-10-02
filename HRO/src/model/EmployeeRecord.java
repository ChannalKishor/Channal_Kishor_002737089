/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Kishor
 */
public class EmployeeRecord {
    private ArrayList<Employee> records;
    
    //constructor
    public EmployeeRecord(){
        //initialzie ArrayList objects of Employees
        this.records = new ArrayList<Employee>();
    }
    //getters and setters

    public ArrayList<Employee> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Employee> records) {
        this.records = records;
    }
    
    //method to add values
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        records.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee ep){
        records.remove(ep);
    }
    
    public int listSize(){
        return records.size();
    }
}
