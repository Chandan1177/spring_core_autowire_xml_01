package asr.autowire.entity;

public class Departments {

	private Integer deptId;
	private String deptName;
	
	public Departments() {}

	public Departments(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	
}
