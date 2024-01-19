package hello;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Application.class,
                      initializers =
                          ConfigDataApplicationContextInitializer.class)
@TestPropertySource(properties =
                        "spring.main.allow-bean-definition-overriding=true")
public class QuickStartTest {

  @Autowired Application application;

  @Test
  public void quickStartTest() {
    application.quickstartRun();
    ;
  }
}
