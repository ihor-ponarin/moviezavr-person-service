package ua.pon.moviezavr.service.person.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket swaggerApi() {
        return new Docket(SWAGGER_2)
                .groupName("Controller")
                .select()
                .apis(basePackage("ua.pon.moviezavr"))
                .paths(any())
                .build();
    }
}
