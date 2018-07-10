package br.com.lelo.springcloud.mydash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MyDashApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDashApplication.class, args);
    }

}
