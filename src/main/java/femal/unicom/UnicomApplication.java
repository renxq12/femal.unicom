package femal.unicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)  //不需要数据库时
public class UnicomApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicomApplication.class, args);
    }

}
