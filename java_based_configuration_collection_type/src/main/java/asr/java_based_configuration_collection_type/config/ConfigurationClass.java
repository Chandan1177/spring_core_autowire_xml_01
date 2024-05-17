package asr.java_based_configuration_collection_type.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import asr.java_based_configuration_collection_type.entity.CollectionEntity;

@Configuration
public class ConfigurationClass {
	
	private static List<String> getList(){
		return Arrays.asList("java","python","dart","java");
	}
	
	private static Set<String> getSet(){
		Set<String> set=new HashSet<String>();
		set.add("java");
		set.add("python");
		set.add("dart");
		set.add("python");
		
		return set;
	}
	
	private static Map<Integer,String> getMap(){
		Map <Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "c++");
		map.put(3, "Python");
		map.put(2, "c#");
		return map;
	}
	
	private static Properties getProp(){
		Properties prop=new Properties();
		prop.put("first", "java");
		return prop;
	}

	@Bean("entity")
	public CollectionEntity getObj() {
		CollectionEntity entity=new CollectionEntity();
		entity.setList(getList());
		entity.setSet(getSet());
		entity.setMap(getMap());
		entity.setProp(getProp());
		return entity;
	}
	
}
