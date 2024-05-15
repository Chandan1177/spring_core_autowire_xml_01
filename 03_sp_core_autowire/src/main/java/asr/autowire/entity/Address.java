package asr.autowire.entity;

public class Address {

	private String district;
	private String state;
	private Integer pinCode;
	
	public Address() {}
	
	public Address(String district, String state, Integer pinCode) {
		this.district = district;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	
}
