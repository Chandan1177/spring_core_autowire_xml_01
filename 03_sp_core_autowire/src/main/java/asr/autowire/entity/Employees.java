package asr.autowire.entity;

public class Employees {

	private Integer empId;
	private String empName;
	private Departments empDept;
	private Address empAddress;
	
	//default constructor
	public Employees() {
	
	}

	//constructor using fields
	public Employees(Integer empId, String empName, Departments empDept, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empAddress = empAddress;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Departments getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Departments empDept) {
		this.empDept = empDept;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empAddress="
				+ empAddress + "]";
	}
		
	
		
}
