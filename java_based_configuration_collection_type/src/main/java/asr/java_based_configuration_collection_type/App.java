package asr.java_based_configuration_collection_type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import asr.java_based_configuration_collection_type.config.ConfigurationClass;
import asr.java_based_configuration_collection_type.entity.CollectionEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        CollectionEntity entity = context.getBean("entity",CollectionEntity.class);
        System.out.println(entity);
    }
}
