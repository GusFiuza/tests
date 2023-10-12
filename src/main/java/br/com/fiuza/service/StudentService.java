package br.com.fiuza.service;

import br.com.fiuza.entity.StudentEntity;
import br.com.fiuza.model.Student;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class StudentService {
    public List<Student> get() {
        List<StudentEntity> listAll = StudentEntity.findAll().list();
        return listAll.stream().map(ie -> {
            return new Student(ie.id, ie.code, ie.last_name);
        }).collect(Collectors.toList());
    }

    public Student getById(Long id) {
        StudentEntity student = StudentEntity.findById(id);
        return new Student(student.id, student.code, student.last_name);
    }

    @Transactional
    public StudentEntity create(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.code = student.getCode();
        studentEntity.last_name = student.getLast_name();
        studentEntity.persist();
        return studentEntity;
    }

    @Transactional
    public StudentEntity update(Student Student) {
        StudentEntity entity = StudentEntity.findById(Student.getId());
        entity.code = Student.getCode();
        entity.last_name = Student.getLast_name();
        return entity;
    }

    @Transactional
    public void delete(Long id) {
        StudentEntity.deleteById(id);
    }

}