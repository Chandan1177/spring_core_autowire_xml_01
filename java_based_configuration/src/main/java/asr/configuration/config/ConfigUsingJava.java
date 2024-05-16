package asr.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import asr.configuration.entity.PrimitiveDataEntity;

@Configuration
public class ConfigUsingJava {

	@Bean("object")
	public PrimitiveDataEntity getObj() {
		PrimitiveDataEntity obj=new PrimitiveDataEntity();
		obj.setBoolValue(false);
		obj.setByteValue((byte)120);
		obj.setShortValue((short)200);
		obj.setIntValue(500);
		obj.setCharValue('A');
		obj.setDoubleValue(100.00);
		obj.setFloatValue(500.50f);
		obj.setLongValue(8000l);
		return obj;
	}
	
}
