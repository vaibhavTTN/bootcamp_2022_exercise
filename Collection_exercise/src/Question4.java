import java.util.*;

//4) Create class Employees with attributes name,age,designation
// and use instances of these class as keys in a Map and their salary as value
class Employees{
    String Name;
    int Age;
    String Designation;

    public Employees(String Name,int Age,String Designation){
        this.Name = Name;
        this.Age = Age;
        this.Designation = Designation;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Designation='" + Designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees empsloyees = (Employees) o;
        return Age == empsloyees.Age && Objects.equals(Name, empsloyees.Name) && Objects.equals(Designation, empsloyees.Designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, Designation);
    }
}
public class Question4 {

    public static void iterateList(Map<Employees,Integer> map){
        for(Employees item:map.keySet()){
            System.out.print(item.Name +"       ");
            System.out.print(item.Age+"         ");
            System.out.print(item.Designation+"      ");
            System.out.println("Salary : "+map.get(item));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Employees,Integer> map = new HashMap<Employees,Integer>();
        Employees emps1 = new Employees("vaibhav", 21,"Software engineer");
        Employees emps10 = new Employees("vaibhav", 21,"Software engineer");
        Employees emps2 = new Employees("sita",21,"Software engineer");
        Employees emps3 = new Employees("ramtari",21,"Software engineer");
        Employees emps4 = new Employees("naveen",21,"electrical engineer");
        Employees emps5 = new Employees("kartikey",21,"Software engineer");
        Employees emps6 = new Employees("vedika",21,"Civil engineer");
        Employees emps7 = new Employees("kamal",21,"Hardware engineer");
        Employees emps8 = new Employees("mohit",21,"IT engineer");
        Employees emps9 = new Employees("mohit",21,"IT engineer");



        map.put(emps1,25000);
        map.put(emps2,22000);
        map.put(emps3,24000);
        map.put(emps4,25000);
        map.put(emps5,27000);
        map.put(emps6,85000);
        map.put(emps7,35000);
        map.put(emps8,15000);
        map.put(emps9,27000);
        map.put(emps10,27000);

        iterateList(map);
    }


}
