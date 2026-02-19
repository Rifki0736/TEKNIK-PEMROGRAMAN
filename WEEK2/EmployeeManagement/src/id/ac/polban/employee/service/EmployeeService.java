/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MR.IPI
 */

    

package id.ac.polban.employee.service;

import java.util.HashMap; 
import java.util.Map;
import id.ac.polban.employee.model.*; // Mengimpor semua kelas dari package model

public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    public Employee getEmployee(int id) { 
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent){ 
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent / 100));
        }
    }
}