package org.springframework.data.gigaspaces.integration.manual;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.gigaspaces.integration.BaseRepositoryTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Test for manual wiring of custom repository implementations (implementing
 * custom methods and using repository interface at the same time).
 *
 * @author Leonid_Poliakov
 */

@SpringJUnitConfig
@TestMethodOrder(MethodName.class)
public class RepositoryManualWiringTest extends BaseRepositoryTest {
  @Autowired private PersonRepositoryExtended repositoryExtended;

  @Test
  public void testCustomMethod() {
    assertEquals("Hello, world!", repositoryExtended.customMethod());
  }
}
