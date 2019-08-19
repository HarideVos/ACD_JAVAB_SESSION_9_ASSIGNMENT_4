package ninepointfour;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	private String name;
	private String des;
	private int salary;
	public Employee(String name,
			String des, int salary) {
		this.name = name;
		this.des = des;
		this.salary=salary;
	}
	public static class empCompare implements Comparator<Employee> {
		@Override
		public int compare(Employee e1,Employee e2) {
			if(e1.name.compareTo(e2.name) > 0) {
				return 1;
			}
			else if(e1.name.compareTo(e2.name) < 0) {
				return -1;
			}
			else {
				if(e1.des.compareTo(e2.des) > 0) {
					return 1;
				}
				else if(e1.des.compareTo(e2.des) < 0) {
					return -1;
				}
				
				
			}
			return 0;
		}
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(salary > e.salary) {
			return 1;
		}
		else if(e.salary > salary) {
			return -1;
		}
		else {
			if(this.name.compareTo(e.name) > 0) {
				return 1;
			}
			else if(this.name.compareTo(e.name) < 0) {
				return -1;
			}
			else {
				if(this.des.compareTo(e.des) > 0) {
					return 1;
				}
				else if(this.des.compareTo(e.des) < 0) {
					return -1;
				}
				
				
			}
		}
		return 0;
	}
	@Override
	public String toString() {
		String str="\nName:" + name + ", Designation:"
				+ des + ", Salary:" + salary;
		return str;
	}
	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<Employee>();
		s.add(new Employee("Adrian","Legal",1500));
		s.add(new Employee("Alma","PR", 1250));
		s.add(new Employee("Ove","HR",1750));
		s.add(new Employee("Ulrich","Sales",2500));
		s.add(new Employee("Pieters","IT",500));
		System.out.println(s);
		Set<Employee> s2=new TreeSet<Employee>(new empCompare());
		s2.add(new Employee("Adrian","Legal",1500));
		s2.add(new Employee("Alma","PR", 1250));
		s2.add(new Employee("Ove","HR",1750));
		s2.add(new Employee("Ulrich","Sales",2500));
		s2.add(new Employee("Pieters","IT",500));
		System.out.println(s2);
	}
	
}