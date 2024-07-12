package com.programmingtechie.inventoryservice.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InventoryServiceApi {

    @Bean
    public OpenAPI inventoryServiceAPI() {

        return new OpenAPI().info(
                        new Info().title("Inventory Service API").version("v0.0.1").description("Inventory Service API").license(new License().name("Apache 2.0")))
                .externalDocs(new ExternalDocumentation().description("You can refer to the Inventory Service Wiki Documenetation")
                        .url("https://github.com/inventory-service-dummy-url.com/docs"));
    }

}
