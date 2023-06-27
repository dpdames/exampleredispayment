package com.example.javaexampleredis;

import entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import repository.PaymentDao;

@SpringBootApplication
@RestController
@RequestMapping("/Payment")
public class JavaexampleredisApplication {
	private PaymentDao daoPayment;

	@PostMapping("/{payment}")
	public Payment findProductById(@PathVariable long id_transaction){
		return daoPayment.findProductById(id_transaction);
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaexampleredisApplication.class, args);
	}

}
