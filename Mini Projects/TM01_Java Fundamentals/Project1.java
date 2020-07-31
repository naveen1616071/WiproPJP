public class Project1 {

	public static void main(String[] args) {

		int emp_no[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String emp_name[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
		String join_date[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000",
				"12/06/2006" };
		char D_code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String Dept[] = { "R&D", "PM", "Acct", "FrontDesk", "Engg", "Manufacturing", "PM" };
		int Basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int Hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int It[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		String Desig[] = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager" };
		int Da[] = { 20000, 32000, 12000, 15000, 40000 };

		int n = Integer.parseInt(args[0]);
		int a = 0, b = 0;
		for (int i = 0; i < 7; i++) {
			if (emp_no[i] == n) {
				a = i;
				b = 1;
			}
		}
		if (b == 1) {
			int DA = 0;
			System.out.println("EmpNo " + emp_no[a]);
			System.out.println("Emp Name " + emp_name[a]);
			System.out.println("Department " + Dept[a]);
			System.out.print("Desination ");
			switch (D_code[a]) {
			case 'e':
				System.out.print("Engineer");
				DA = 20000;
				break;
			case 'c':
				System.out.print("Consultant");
				DA = 32000;
				break;
			case 'k':
				System.out.print("clerk");
				DA = 12000;
				break;
			case 'r':
				System.out.print("Receptionist");
				DA = 15000;
				break;
			case 'm':
				System.out.print("Manager");
				DA = 40000;
				break;
			default:
				System.out.println("invalid");
				break;
			}
			System.out.println();
			int sum = Basic[a] + Hra[a] + DA - It[a];
			System.out.println("Salary " + sum);
		} else {
			System.out.println("There is no employee with empID : " + n);
		}
	}
}
