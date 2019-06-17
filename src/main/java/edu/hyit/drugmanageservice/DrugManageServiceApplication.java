package edu.hyit.drugmanageservice;

import edu.hyit.drugmanageservice.sys.base.BaseModel;
import edu.hyit.drugmanageservice.sys.interceptor.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("edu.hyit.drugmanageservice.app.dao")
public class DrugManageServiceApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DrugManageServiceApplication.class, args);
    }

    /**
     *配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/api/login/**");
    }
}
