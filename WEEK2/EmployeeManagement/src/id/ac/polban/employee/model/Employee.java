/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee.model;

/**
 *
 * @author MR.IPI
 */


public class Employee { 
    private int id; 
    private String name;
    private Department department;
    private EmploymentType type; 
    private double salary;

    // --- PENERAPAN STATIC FIELD ---
    // Variabel ini milik kelas (bukan objek), digunakan untuk melacak total karyawan yang dibuat
    private static int totalEmployees = 0;

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = id; 
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        
        totalEmployees++; // Setiap kali objek Employee dibuat, total bertambah 1
    }

    // --- PENERAPAN STATIC METHOD ---
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // --- GETTER & SETTER ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
    
    public EmploymentType getType() { return type; }
    public void setType(EmploymentType type) { this.type = type; }
    
    public double getSalary() { return salary; }
    public void setSalary(double salary){ this.salary = salary; }
}