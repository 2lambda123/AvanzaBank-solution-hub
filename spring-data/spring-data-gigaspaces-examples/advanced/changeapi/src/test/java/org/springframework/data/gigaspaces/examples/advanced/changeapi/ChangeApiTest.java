package org.springframework.data.gigaspaces.examples.advanced.changeapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath*:spring-context.xml")
public class ChangeApiTest {

    @Autowired
    ChangeApiExample changeApiExample;

    @Test
    public void changeApiTest(){
        changeApiExample.run();
    }
}
