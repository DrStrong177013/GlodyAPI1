package com.glody.glodyAPI.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Glody API Documentation")
                        .version("1.0")
                        .description("Tài liệu REST API cho toàn bộ hệ thống Glody.")
                        .contact(new Contact()
                                .name("Glody Dev Team")
                                .email("support@glody.com")));
    }
}
