package kau.isabu.web_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// 컴파일 확인을 위한 설정 -> DB 설정 시 제거할 것
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WebProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

}
