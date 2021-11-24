import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 
//Implement Comparable to sort Employee on basis of Name, Salary and joining Date
class Employee implements Comparable<Employee> {
	int empId;
	float salary;
	Date dob;
	Date dateOfJoining;
	String name;
 
    public Employee() {
    }
 
    public Employee(String name,int empId,float salary,Date dateOfJoining,Date dob) {
        this.empId=empId;
		this.salary=salary;
		this.dob=dob;
		this.dateOfJoining=dateOfJoining;
		this.name=name;
    }
 
    public String toString() {
           return "\n name=" + name +",empId="+empId+ ",salary=" + salary + ",dateOfJoining="+ dateOfJoining+",dob="+dob;
    }
 
    public int compareTo(Employee o) {
           return this.name.compareTo(o.name) +(this.empId.compareTo(o.empId))+ (this.salary.compareTo(o.salary))+ (this.dateOfJoining.compareTo(o.dateOfJoining))+(this.dob.compareTo(o.dob));
    }
}
 
public class EmployeeTest {
 
    public static void main(String[] args) {
 
           Employee emp1 = new Employee("raju", 111,10000, new Date(2016 - 1900, 10, 14),new Date(1995 - 1900, 10, 11));
           Employee emp2 = new Employee("ravi", 222,20000, new Date(2016 - 1900, 11, 15),new Date(1998 - 1900, 11, 17));
           Employee emp3 = new Employee("raju", 111,10000, new Date(2016 - 1900, 14, 16),new Date(1995 - 1900, 13, 18));
           Employee emp4 = new Employee("raju", 111,10000, new Date(2016 - 1900, 12, 17),new Date(1996 - 1900, 14, 19));
           Employee emp5 = new Employee("raju", 111,10000, new Date(2016 - 1900, 14, 18),new Date(1997 - 1900, 15, 14));
 
           List<Employee> l = new ArrayList<Employee>();
           l.add(emp1);
           l.add(emp2);
           l.add(emp3);
           l.add(emp4);
           l.add(emp5);
 
           Collections.sort(l); // SORT
 
           System.out.println(l); // Display list
 
    }
 
}