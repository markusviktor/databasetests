package hu.markusviktor.databasetests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DatabasetestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabasetestsApplication.class, args);
    }

}
