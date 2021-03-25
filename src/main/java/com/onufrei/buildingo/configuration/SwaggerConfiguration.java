package com.onufrei.buildingo.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The representation of the object of SwaggerConfiguration
 *
 * @author Artem Onufrei
 * @version 1
 * @since 24.03.2021
 */

@Configuration
public class SwaggerConfiguration {
    public OpenAPI employeeOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                        .title("Building Organization")
                        .version("1.0")
                        .contact(
                                new Contact()
                            .email("helloworld@mail.com")
                            .name("My Name")
                            .url("website.com.ua")
                        )

                );
    }


}
