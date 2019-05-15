class Person{
	String name;
	public String showName(){
		return name;
	}
}


class Employee extends Person{
	int employeeNumber;
	public int showEmployeeNumber(){
		return employeeNumber;
	}
}

class Faculty extends Employee{
	String facultyName;
	public String showFacultyName(){
		return facultyName;
	}
}

class Staff extends Employee{
	int staffNum;
	public int showStaffNum(){
		return staffNum;
	}
}

class Student extends Person{
	String schoolName;
	public String showSchoolName(){
		return schoolName;
	}
}

class Undergraduate extends Student{
	String deptName;
	public String showDeptName(){
		return deptName;
	}
}

class Graduate extends Student{
	int graduateNum;
	public int showGraduateNum(){
		return graduateNum;
	}
}

class Masters extends Graduate{
	String mastersInUni;
	public String showMastersInUni(){
		return mastersInUni;
	}
}

class Doctoral extends Graduate{
	String doctoralFrom;
	public String showDoctoralForm(){
		return doctoralFrom;
	}
}

class Nondegree extends Graduate{
	int nondeg;

	public int showNondegree(){
		return nondeg;
	}
}

class Hierarchi{
	public static void main(String[] args) {
		Staff s = new Staff();
		Faculty f = new Faculty();

		Undergraduate u = new Undergraduate();
		Nondegree n = new Nondegree();

		s.name = "Yameen Bloch";
		s.employeeNumber = 13;
		f.facultyName = "CIVIL";
		s.staffNum = 60;
		u.schoolName = "MUET";
		u.deptName = "Software";
		n.graduateNum = 12345;
		n.mastersInUni = "FAST";
		n.doctoralFrom = "TURKEY";
		n.nondeg = 123;
		System.out.println(s.showName());
		System.out.println(s.showEmployeeNumber());
		System.out.println(f.showFacultyName());
		System.out.println(s.showStaffNum());

		System.out.println(u.showSchoolName());
		System.out.println(u.showDeptName());
		System.out.println(n.showGraduateNum());
		System.out.println(n.showMastersInUni());
		System.out.println(n.showDeptName());
		System.out.println(n .showDoctoralForm());
		System.out.println(n.showDeptName());
		System.out.println(s.showDeptName());
	}
}