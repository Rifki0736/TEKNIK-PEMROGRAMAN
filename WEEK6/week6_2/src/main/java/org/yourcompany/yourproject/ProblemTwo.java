/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author MR.IPI
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemTwo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(101, "Joe"),
            new Student(103, "Zulkifli"),
            new Student(102, "Riza"),
            new Student(104, "Alice"),
            new Student(105, "Joshua")
        );

        List<Student> ans = students.stream()
            .sorted((s1, s2) -> {
                // If names are equal (case-insensitive), sort by ID
                if (s1.getName().equalsIgnoreCase(s2.getName())) {
                    return Integer.compare(s1.getId(), s2.getId());
                }
                // Otherwise, sort by Name alphabetically
                return s1.getName().compareToIgnoreCase(s2.getName());
            })
            .collect(Collectors.toList());

        // Print the sorted results
        ans.forEach(System.out::println);
    }
}