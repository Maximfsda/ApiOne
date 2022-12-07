package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private Map<Long, Student>  studentMap = new HashMap<>();
    private Long counter = 1L;

    public Student createStudent(Student student) {
        studentMap.put(counter, student);
        counter++;
        return student;
    }

    public Student getStudentById(Long studentId) {
        return studentMap.get(studentId);
    }

    public Student updateFaculty(Long studentId, Student student) {
        studentMap.put(studentId, student);
        return student;
    }

    public Student deleteStudent(Long studentId) {
        return studentMap.remove(studentId);
    }
}
