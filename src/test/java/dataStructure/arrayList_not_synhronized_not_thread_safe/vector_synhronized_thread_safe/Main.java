package dataStructure.arrayList_not_synhronized_not_thread_safe.vector_synhronized_thread_safe;

import dataStructure.Employee;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "wilson", 3245));
    }
}
