package ch.admin.bit.jeap.template;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
@Tag(name = "example", description = "Example resource")
class ExampleResource {

    @Value("${hello.message}")
    String helloMessage;

    @Value("${stage}")
    String stage;

    @GetMapping("/hello")
    @Operation(
            summary = "Hello",
            description = "Hello, world")
    @ApiResponse(responseCode = "200", description = "Success")
    public String hello() {
        return helloMessage + ": " + stage + ".";
    }
}
