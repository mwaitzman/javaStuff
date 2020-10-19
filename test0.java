public class Person {
private enum Gender {
MALE, FEMALE
}
private String name;
private int age;
private long UUID;
private Date DOB;
private Gender gender;
}
public class Employee {
private Person person;
private Company company;
}
public class Company {
private String name;
//private long UUID;
private UUID idn;
}


/*
example that will take an array of employees and then return a 2 dimensional array of those employees grouped by company and sorted by name
*/

/*
input is Employee[] Employees
output is Employee[][] GroupedAndSortedEmployees

output is the following permutation of Employees:
first dimension is an array of an array containing all employees in the same company
  each 
*/
//Other way of doing it:
Employee[] Employees;
Employee[][] GroupedAndSortedEmployees =
String[] groupNames =
for(int i = 0; i < Employees.length; i++) {
  for(int j = 0; j < groupNames.length; j++) {
    if(Employee[i].getName() == groupName[j])
    isUnique == false;
  }
  else if(j == groupName.length-1) {
    isUnique = true;
    groupName.add(Employee[i].getName());
  }
}
for(Employee employee: Employees) {
  for(String groupName: groupNames) {
    if(employee.getName() == groupName) {
      return true;
    }
  }
  if true {
    groupNames.add(employee.getName);
  }

}
//
Employee[] Employees;
Employee[][] GroupedAndSortedEmployees =
Employees.groupBy(this.company)
  .forEach([] group = group.sortBy(member member.name))
//
Employee[] Employees
Stream(Employees).to(obj -> obj.class[]).groupBy(this.company::get).forEach(group -> group.sort(item -> item.name.get() -> ))
