package asr.configuration.entity;

public class PrimitiveDataEntity {

	private int intValue;
	private short shortValue;
	private long longValue;
	private float floatValue;
	private double doubleValue;
	private char charValue;
	private boolean boolValue;
	private byte byteValue;
	
	
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public short getShortValue() {
		return shortValue;
	}
	public void setShortValue(short shortValue) {
		this.shortValue = shortValue;
	}
	public long getLongValue() {
		return longValue;
	}
	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}
	public float getFloatValue() {
		return floatValue;
	}
	public void setFloatValue(float floatValue) {
		this.floatValue = floatValue;
	}
	public double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	public char getCharValue() {
		return charValue;
	}
	public void setCharValue(char charValue) {
		this.charValue = charValue;
	}
	public boolean isBoolValue() {
		return boolValue;
	}
	public void setBoolValue(boolean boolValue) {
		this.boolValue = boolValue;
	}
	public byte getByteValue() {
		return byteValue;
	}
	public void setByteValue(byte byteValue) {
		this.byteValue = byteValue;
	}
	@Override
	public String toString() {
		return "PrimitiveDataEntity [intValue=" + intValue + ", shortValue=" + shortValue + ", longValue=" + longValue
				+ ", floatValue=" + floatValue + ", doubleValue=" + doubleValue + ", charValue=" + charValue
				+ ", boolValue=" + boolValue + ", byteValue=" + byteValue + "]";
	}
	
	
	
}
