package org.springframework.data.gigaspaces.integration.javaconfig;

/**
 * @author Anna_Babich
 */

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.data.gigaspaces.integration.BaseRepositoryTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
/**
 * Tests for creating Repository using JavaConfig.
 */

@TestMethodOrder(MethodName.class)
@SpringJUnitConfig(RepositoryContextConfiguration.class)
public class RepositoryJavaConfigTest extends BaseRepositoryTest {}
