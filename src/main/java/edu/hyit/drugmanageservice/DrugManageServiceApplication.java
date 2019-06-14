package edu.hyit.drugmanageservice;

import edu.hyit.drugmanageservice.sys.base.BaseModel;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.hyit.drugmanageservice.app.dao")
public class DrugManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugManageServiceApplication.class, args);
    }

}
