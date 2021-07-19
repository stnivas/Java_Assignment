
public class Employee {
String name;
int salary;
String IDnumber;

Employee(String EmployeeName){
	

name =EmployeeName;

System.out.println("Name of the Employee:"+name);
System.out.println("-----------------------");
System.out.println("----------------------------");
}

Employee(String EmployeeName, int EmployeeSalary){
	
name =EmployeeName;
salary=EmployeeSalary;

System.out.println("Name of the Employee:"+name);
System.out.println("salary of the Employee:"+salary);
System.out.println("------------------------");
}

Employee(String EmployeeName, int EmployeeSalary,String phoneNumber){
name =EmployeeName;
salary=EmployeeSalary;
IDnumber=phoneNumber;


System.out.println("Name of the Employee:"+name);
System.out.println("salary of the Employee:"+salary);
System.out.println("Employee IDNumber of the Employee:"+IDnumber);
}
	public static void main(String[] args) {
		Employee callobj=new Employee("murugan");
		Employee callobj1=new Employee("murugan",30000);
		Employee callobj2 =new Employee("murugan",30000,"EMP1234567890" );
		
	

	}

}
