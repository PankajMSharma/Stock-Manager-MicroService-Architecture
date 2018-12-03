package geek.pankaj.stock.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import geek.pankaj.stock.dbservice.resource.DbServiceResource;

/**
 * @author Pankaj Sharma
 *
 */
@SpringBootApplication
@ComponentScan
@EnableJpaRepositories(basePackages = "geek.pankaj.stock.dbservice.repository")
public class DbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}
}
