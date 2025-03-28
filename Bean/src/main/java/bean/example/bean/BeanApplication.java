package bean.example.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		//Staff staff = context.getBean(Doctor.class);
		//Doctor doctor = context.getBean(Doctor.class);
		//Nurse nurse = context.getBean(Nurse.class);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		Doctor doctor = applicationContext.getBean(Doctor.class);
		doctor.setQulification("MBBS");


		//doctor.getNurse().assist();
		//System.out.println(doctor.getQulification());
		//nurse.assist();

		Doctor doctor2 = applicationContext.getBean(Doctor.class);
		doctor2.setQulification("Normal");

		System.out.println(doctor.getQulification());
		System.out.println(doctor2.getQulification());
	}

}
