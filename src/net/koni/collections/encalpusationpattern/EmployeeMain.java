package net.koni.collections.encalpusationpattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


class EmployeeList {
	//1
	List<Employee> addEmployee(){
		
		Employee e1 = new Employee();
		e1.setName("Haneef");
		e1.setDept("Mech");
		e1.setId(49);
		
		Employee e2 = new Employee();
		e2.setName("zakir");
		e2.setDept("EEE");
		e2.setId(8);
		
		Employee e3 = new Employee();
		e3.setName("Khadeer");
		e3.setDept("IT");
		e3.setId(9);
		
		List <Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		return list;
		
	}
	//2
	public  Employee getEmployeebyIndex(List<Employee> list , int Index) {
		return list.get(Index);
		
	}
	//3
	int countEmployee(List<Employee> list) {
		return list.size();
	}
	//4
	Employee updateDepartment(List<Employee> list) {
		Employee e=list.get(2);
		
		e.setDept("Admin");
		
		return e;
		
	}
	 // Q5: Store Unique Employees (HashSet)
	Set<Employee> storeUniqueEmployees(List<Employee> list) {
        Set<Employee> set = new HashSet<>();
        set.addAll(list);
        return set;
    
    }
	//6 : add dupliate employee
	int addDuplicateEmployee(List<Employee> list) {
		Employee duplicate = new Employee();
        duplicate.setId(49);
        duplicate.setName("Haneef");
        duplicate.setDept("Mech");
        Set<Employee> set = new HashSet<>(list);
        set.add(duplicate); 

        return set.size();
	}
	 // Q7: Check Employee Exists in HashSet
    boolean employeeExists(Set<Employee> set, int id) {
        Employee temp = new Employee();
        temp.setId(id);
        return set.contains(temp);
    }

    // Q8: Store Employees with Order
    LinkedHashSet<Employee> storeWithOrder(List<Employee> list) {
        return new LinkedHashSet<>(list);
    }

    // Q9: Preserve Order
    String checkOrder(LinkedHashSet<Employee> set) {
        return "Order Preserved";
    }

    // Q10: Remove Employee by ID
    Set<Employee> removeEmployee(Set<Employee> set, int id) {
        Employee temp = new Employee();
        temp.setId(id);
        set.remove(temp);
        return set;
    }

    // Q11: Get Employee Count from Set
    int getEmployeeCount(Set<Employee> set) {
        return set.size();
    }

    // Q12: Clear Employee Records
    void clearEmployees(Set<Employee> set) {
        set.clear();
    }

    // Q13: Get Employees by Department
    List<Employee> getByDepartment(List<Employee> list, String dept) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : list) {
            if (e.getDept().equalsIgnoreCase(dept)) {
                result.add(e);
            }
        }
        return result;
    }

    // Q14: Check Employee Exists in List
    boolean employeeExistsInList(List<Employee> list, int id) {
        for (Employee e : list) {
            if (e.getId() == id)
                return true;
        }
        return false;
    }

    // Q15: Prevent Duplicate Entry
    boolean addIfUnique(Set<Employee> set, Employee emp) {
        return set.add(emp);
    }

    // Q16: Convert List to HashSet
    Set<Employee> convertListToSet(List<Employee> list) {
        return new HashSet<>(list);
    }

    // Q17: Get First Employee
    Employee getFirstEmployee(LinkedHashSet<Employee> set) {
        return set.iterator().next();
    }

    // Q18: Get Last Employee
    Employee getLastEmployee(LinkedHashSet<Employee> set) {
        Employee last = null;
        for (Employee e : set) last = e;
        return last;
    }

    // Q19: Check Employee Data Empty
    boolean isEmpty(Collection<Employee> col) {
        return col.isEmpty();
    }

    // Q20: Get All Employee Names
    List<String> getEmployeeNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        for (Employee e : list) {
            names.add(e.getName());
        }
        return names;
    }
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeList emplist = new EmployeeList();
		List<Employee> list = emplist.addEmployee();
		System.out.println(list);
		
		System.out.println("Employee at index 1: " +
                emplist.getEmployeebyIndex(list, 1));
		
		System.out.println("Total Employee = " + emplist.countEmployee(list));
		
		System.out.println("Updated emp : " + emplist.updateDepartment(list));
		
		Set<Employee> set = emplist.storeUniqueEmployees(list);
		 System.out.println("HashSet Size (unique employees): " + set.size());
		 
		 System.out.println("Total Employees in HashSet after duplicate: "
	                +emplist.addDuplicateEmployee(list));
		 
		
	        System.out.println("Employee Exists (ID 49): "
	                + (emplist.employeeExists(set, 49)
	                ? "Employee Found" : "Employee Not Found"));

	        
	        LinkedHashSet<Employee> lset = emplist.storeWithOrder(list);
	        System.out.println("Employees with Order: " + lset);

	        
	        System.out.println("Order Check: "
	                + emplist.checkOrder(lset));

	        
	        System.out.println("After Removing Employee ID 8: "
	                + emplist.removeEmployee(set, 8));

	        
	        System.out.println("Employee Count in Set: "
	                + emplist.getEmployeeCount(set));

	      
	        emplist.clearEmployees(set);
	        System.out.println("Employee Records Cleared");

	        
	        System.out.println("Employees in IT Department: "
	                + emplist.getByDepartment(list, "IT"));

	        
	        System.out.println("Employee Exists in List (ID 105): "
	                + (emplist.employeeExistsInList(list, 105)
	                ? "Employee Found" : "Employee Not Found"));

	        // Q15
	        Employee newEmp = new Employee();
	        newEmp.setId(49);
	        newEmp.setName("Haneef");
	        newEmp.setDept("Mech");

	        Set<Employee> uniqueSet = emplist.storeUniqueEmployees(list);
	        System.out.println("Add Unique Employee: "
	                + (emplist.addIfUnique(uniqueSet, newEmp)
	                ? "Employee Added Successfully"
	                : "Duplicate Employee – Not Added"));

	        // Q16
	        System.out.println("List converted to HashSet: "
	                + emplist.convertListToSet(list));

	        // Q17
	        System.out.println("First Employee: "
	                + emplist.getFirstEmployee(lset));

	        // Q18
	        System.out.println("Last Employee: "
	                + emplist.getLastEmployee(lset));

	        // Q19
	        System.out.println("Employee Data Status: "
	                + (emplist.isEmpty(list)
	                ? "No Employee Data"
	                : "Employee Data Exists"));

	        // Q20
	        System.out.println("Employee Names: "
	                + emplist.getEmployeeNames(list));

	}

}
