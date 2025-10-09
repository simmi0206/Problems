package practical.hashing;

public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // same memory reference
        if (obj == null || getClass() != obj.getClass()) return false; // null or diff type

        Employee emp=(Employee) obj;
        return id==emp.id && (name != null ? name.equals(emp.name) : emp.name==null);//considered equal if they have the same id (or maybe same id and name, depending on your logic).

    }
    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(id,name,department);
    }

}
