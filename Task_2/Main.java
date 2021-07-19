package packages;

public class Main {

	public static void main(String[] args) {
		employeeDetails7 obj =new employeeDetails7();
		obj.setName("nivas");
		obj.setAge(22);
		obj.setCompanyName("ABCD SOFTWARE SOLUTION");
		obj.setDesignation("javaDeveloper");
		obj.setCtc(300000);
		System.out.println("Name:"+obj.getName() );
		System.out.println("Age:" +obj.getAge() );
		System.out.println("CompanyName:" +obj.getCompanyName());
		System.out.println("Designation:"+ obj.getDesignation());
		System.out.println("ctc:"+obj.getCtc());
	

	}

}
