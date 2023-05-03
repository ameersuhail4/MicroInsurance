package com.claimManagement.insuranceCompany;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class PolicyServiceApplication implements CommandLineRunner{
	//@Autowired
	//PolicyDAOImp pdaoImp;
	//@Autowired
	//SurveyorDAOImp sdaoImp;
	public static void main(String[] args) {
		SpringApplication.run(PolicyServiceApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		
//		pdaoImp.AddPolicyByHardCode();
//		sdaoImp.addSurveyorByHardCode();
	}
	
}
