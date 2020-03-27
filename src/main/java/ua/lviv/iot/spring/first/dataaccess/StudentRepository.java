package ua.lviv.iot.spring.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.first.rest.model.Student;

// JpaRepository is like CrudRepository, but it is an extension. it gathers the class and the type
// of its @Id field.

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}