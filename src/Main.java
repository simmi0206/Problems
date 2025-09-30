//import java.util.*;
//
//class Employee{
//
//    int id;
//
//    String name;
//
//    Employee(int id, String name) {
//
//        this.id = id;
//
//        this.name = name;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//
//
//
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}
//
//public class RemoveDuplicates {
//
//    public static List<Employee> removeDuplicates(List<Employee> employees) {
//        HashMap<Integer,Employee> map=new HashMap<>();
//        for(int i=0;i<employees.size();i++)
//        {
//
//            if(!map.containsKey(employees.get(i).getId()))
//            {
//                map.put(employees.get(i).getId(),employees.get(i));
//            }
//        }
//
//        return (List<Employee>) map.values();
//
//    }
//
//    public static void main(String[] args) {
//
//        List<Employee> employees = Arrays.asList(
//
//                new Employee(1, "Hari"),
//
//                new Employee(2, "John"),
//
//                new Employee(1, "Hari"),
//
//                new Employee(3, "Alice"),
//
//                new Employee(2, "Johnny")
//
//        );
//
//        List<Employee> unique = removeDuplicates(employees);
//
//        System.out.println(unique);
//
//    }
//
//}
//
//
////remove duplicate based if id is same
//
