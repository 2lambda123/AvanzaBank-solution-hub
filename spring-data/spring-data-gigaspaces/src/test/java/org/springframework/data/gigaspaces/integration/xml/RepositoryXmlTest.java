package org.springframework.data.gigaspaces.integration.xml;

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.data.gigaspaces.integration.BaseRepositoryTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Test for repository XML configuration.
 *
 * Repository is declared in RepositoryXmlTest-context.xml
 *
 * <gigaspaces-data:repositories /> element allows you to simply define a base package that Spring scans for you.
 *
 * @author Anna_Babich
 */
@SpringJUnitConfig
@TestMethodOrder(MethodName.class)
public class RepositoryXmlTest extends BaseRepositoryTest {

}
