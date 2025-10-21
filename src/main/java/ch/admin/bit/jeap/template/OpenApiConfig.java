package ch.admin.bit.jeap.template;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "JME RHOS Example",
                description = "This is the simplest application in the world",
                contact = @Contact(
                        name = "jEAP",
                        url = "https://confluence.bit.admin.ch/display/JEAP"
                )
        ),
        externalDocs = @ExternalDocumentation(url = "https://confluence.bit.admin.ch/display/JEAP"),
        security = {@SecurityRequirement(name = "basicAuth")}
)

@Configuration
public class OpenApiConfig {

    @Bean
    GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("API")
                .pathsToMatch("/api/**")
                .packagesToScan(OpenApiConfig.class.getPackageName())
                .build();
    }
}
