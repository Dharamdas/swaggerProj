package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

@Configuration
@EnableSwagger2
public class SwaggerConfig {



    @Bean
    public Docket springFoxPluginConfiguration() {
        //log.info(String.format("Swagger %s", enableSwagger ? "enabled" : "disabled"));
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Swagger Test")
                .apiInfo(new ApiInfoBuilder()
                        .title("Swagger Test Services")
                        .description("Allows for validating credentials. Allows for getting auth code. Allows for creating account. Allows for reset password.")
                        .license("Swagger Test")
                        .version("1.0")
                        .build())
                .enable(true)
                .select()
                .apis(withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build().pathMapping("/");
    }




}