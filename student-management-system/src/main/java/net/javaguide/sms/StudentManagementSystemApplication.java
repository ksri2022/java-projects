package net.javaguide.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguide.sms.entity.Student;
import net.javaguide.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository; 
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
	/*
		
		Student student2= new Student("Britiu", "Britie Rao", "Brite1@gmail.com");
		studentRepository.save(student2);
		
		Student student3= new Student("Naveen", "Naveen babu", "naveen2@gmail.com");
		studentRepository.save(student3);
		
		*/
		
	}
	
	

}
