package com.rs.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rs.service.EmpService;

@SpringBootApplication(scanBasePackages = "com.rs")

public class BootJdbcTempleteApplication
{
	public static void main(String[] args)
	{
		System.out.println("\n MAIN \n");
		ApplicationContext ctx=null;
		EmpService service=null;
		ctx=SpringApplication.run(BootJdbcTempleteApplication.class, args);
		service=ctx.getBean("empService",EmpService.class);
		System.out.println("Emp Count:::"+service.findEmpCount());
		System.out.println("CLERK Desg Employees::"+service.findEmployeeByDesg("CLERK"));
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
