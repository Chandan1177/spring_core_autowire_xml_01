package asr.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import asr.configuration.config.ConfigUsingJava;
import asr.configuration.entity.PrimitiveDataEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigUsingJava.class);
        Object pde = context.getBean("object");
        System.out.println(pde);
    }
}
