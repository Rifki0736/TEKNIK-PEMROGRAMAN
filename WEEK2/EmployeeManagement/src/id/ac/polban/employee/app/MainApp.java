/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee.app;

/**
 *
 * @author MR.IPI
 */


import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {
        // 1. Buat Objek Pendukung
        Department itDept = new Department("IT Department");
        Department magang = new Department("Magang");
        EmploymentType fullTime = new EmploymentType("Full Time");
        EmploymentType partTime = new EmploymentType("part Time");
        // 2. Buat Objek Karyawan
        Employee emp1 = new Employee(101, "Budi", itDept, fullTime, 5000000);
        Employee emp2 = new Employee(102, "Siti", magang, partTime, 1000000);
        Employee emp3 = new Employee(103, "Nafis", itDept, partTime, 7000000);
        Employee emp4 = new Employee(104, "Rusdya", itDept, partTime, 6900000);
        Employee emp5 = new Employee(105, "Gharin", magang, partTime, 2500000);

        // 3. Gunakan Service
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);
        service.addEmployee(emp3);
        service.addEmployee(emp4);
        service.addEmployee(emp5);

        // 4. Test Kenaikan Gaji
        System.out.println("Gaji Budi sebelum: Rp" + service.getEmployee(101).getSalary());
        service.raiseSalary(101, 70); // Naik 10%
        System.out.println("Gaji Budi sesudah: Rp" + service.getEmployee(101).getSalary());
           
        System.out.println("Gaji siti sebelum: Rp" + service.getEmployee(102).getSalary());
        service.raiseSalary(102, 30); // Naik 10%
        System.out.println("Gaji siti sesudah: Rp" + service.getEmployee(102).getSalary());
        
        System.out.println("Gaji nafis sebelum: Rp" + service.getEmployee(103).getSalary());
        service.raiseSalary(103, 40); // Naik 10%
        System.out.println("Gaji nafis sesudah: Rp" + service.getEmployee(103).getSalary());
        
        System.out.println("Gaji rusdya sebelum: Rp" + service.getEmployee(104).getSalary());
        service.raiseSalary(104, 50); // Naik 10%
        System.out.println("Gaji rusdya sesudah: Rp" + service.getEmployee(104).getSalary());
        
        System.out.println("Gaji gharin sebelum: Rp" + service.getEmployee(105).getSalary());
        service.raiseSalary(105, 90); // Naik 10%
        System.out.println("Gaji gharin sesudah: Rp" + service.getEmployee(105).getSalary());
        // 5. Test Pemanggilan Static Method
        System.out.println("Total karyawan terdaftar: " + Employee.getTotalEmployees());
    }
}