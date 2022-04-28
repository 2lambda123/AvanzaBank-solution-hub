package org.springframework.data.gigaspaces.integration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.gigaspaces.model.Event;
import org.springframework.data.gigaspaces.repository.EventRepository;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


/**
 * Tests that repository save operations work with autogenerated id
 *
 * @author Oleksiy_Dyagilev
 */


@SpringJUnitConfig
@TestMethodOrder(MethodName.class)
public class AutoGeneratedIdTest {

    @Autowired
    private EventRepository eventRepository;

    @Test
    public void testSaveWithAutogeneratedId() {
        Event event = new Event();
        event.setName("event1");
        Event saved = eventRepository.save(event);
        assertNotNull(saved.getId());
    }

    @Test
    public void testSaveMultipleWithAutogeneratedId() {
        Event event1 = new Event();
        event1.setName("event1");

        Event event2 = new Event();
        event2.setName("event2");

        Iterable<Event> save = eventRepository.saveAll(Arrays.asList(event1, event2));

        for (Event event : save) {
            assertNotNull(event.getId());
        }
    }
}
