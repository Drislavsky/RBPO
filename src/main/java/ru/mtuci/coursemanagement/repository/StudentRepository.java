package ru.mtuci.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.coursemanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
