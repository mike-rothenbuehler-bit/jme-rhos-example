package ch.admin.bit.jeap.template;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = "stage=test")
class ServerApplicationTests {

    @Autowired
    private ExampleResource exampleResource;

    @Test
    void contextLoads() {
        assertThat(exampleResource).isNotNull();
    }

}
