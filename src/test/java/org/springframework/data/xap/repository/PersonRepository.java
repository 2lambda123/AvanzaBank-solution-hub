package org.springframework.data.xap.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.xap.model.Person;
import org.springframework.data.xap.repository.query.Projection;

import java.util.List;

/**
 * @author Oleksiy_Dyagilev
 */
public interface PersonRepository extends XapRepository<Person, String> {

    @Query("name=?")
    List<Person> findByName(String name);

    List<Person> findByAge(Integer age);

    List<Person> findByNameAndAge(String name, Integer age);

    List<Person> findByNameOrAge(String name, Integer age);

    List<Person> findBySpouseName(String name);

    List<Person> findByAge(Integer age, Sort sort);

    List<Person> findByAge(Integer age, Pageable pageable);

    List<Person> findByAgeIs(Integer age);

    List<Person> findByNameEquals(String name);

    List<Person> findByAgeBetween(Integer minAge, Integer maxAge);

    List<Person> findByAgeLessThan(Integer age);

    List<Person> findByAgeLessThanEqual(Integer age);

    List<Person> findByAgeGreaterThan(Integer age);

    List<Person> findByAgeGreaterThanEqual(Integer age);

    List<Person> findByAge(Integer age, Projection projection);


}
