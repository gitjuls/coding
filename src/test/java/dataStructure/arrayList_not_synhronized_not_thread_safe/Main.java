package dataStructure.arrayList_not_synhronized_not_thread_safe;

import dataStructure.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Array list good for random access by index, not for insertion or removal

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "wilson", 3245));

        //System.out.println(employeeList.get(1));

        //replace by index, O(n)constant time
        employeeList.set(1, new Employee("John", "Adams", 4568));

        //add by index, worst case O(n) because it required shift the elements
        employeeList.add(3,new Employee("John", "Doe", 4567));

        //employeeList.forEach(employee -> System.out.println(employee));

        //convert to an array
        Object[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Object employee: employeeArray){
            System.out.println(employee);
        }

        //Implemented equal method in the Main class
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        //remove by index, after removing elements need to be shifted, O(n)
        employeeList.remove(2);
    }
}
