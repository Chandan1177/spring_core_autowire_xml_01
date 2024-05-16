package asr.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import asr.autowire.entity.Employees;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Employees emp = context.getBean(Employees.class);
       System.out.println(emp);
    }
}
