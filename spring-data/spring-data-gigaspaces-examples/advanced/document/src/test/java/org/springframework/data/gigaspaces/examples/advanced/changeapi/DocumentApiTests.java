package org.springframework.data.gigaspaces.examples.advanced.changeapi;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Leonid_Poliakov.
 */

@SpringJUnitConfig(locations = "classpath*:spring-context.xml")
public class DocumentApiTests {
  private static Logger log = LoggerFactory.getLogger(DocumentApiMain.class);

  @Autowired DocumentApiExample documentApiExample;
  @Test
  public void validateThatTestRunWithoutIssue() {
    documentApiExample.run();
  }
}