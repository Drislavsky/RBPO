package ru.mtuci.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mtuci.coursemanagement.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
