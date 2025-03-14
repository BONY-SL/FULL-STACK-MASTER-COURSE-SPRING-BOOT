package com.example.depd.injec.DependencyInjection;

import com.example.depd.injec.DependencyInjection.service.ColorPrinter;
import com.example.depd.injec.DependencyInjection.service.Impl.ColorPrinterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	@Qualifier("colorPrinter")
	private final ColorPrinter colorPrinter;

	public DependencyInjectionApplication(ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Application Started...");
		logger.info(colorPrinter.print());
		logger.info("Command Line Application");
	}
}
