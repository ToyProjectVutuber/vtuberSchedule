package vtuberSchedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "vtuberSchedule.model.repository")
public class VtuberScheduleApplication {
	public static void main(String[] args) {
		SpringApplication.run(VtuberScheduleApplication.class, args);
	}
}