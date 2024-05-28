package com.lizana.mscalzado.infraestructure.adapter;


import com.lizana.mscalzado.domain.model.Student;
import com.lizana.mscalzado.domain.port.StudentPersistencePort;
import com.lizana.mscalzado.infraestructure.adapter.entity.StudentEntity;
import com.lizana.mscalzado.infraestructure.adapter.mapper.StudentDboMapper;
import com.lizana.mscalzado.infraestructure.adapter.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class StudentSpringJpaAdapter implements StudentPersistencePort {

    private final StudentRepository studentRepository;
    private final StudentDboMapper studentDboMapper;

    public StudentSpringJpaAdapter(StudentRepository studentRepository, StudentDboMapper studentDboMapper) {
        this.studentRepository = studentRepository;
        this.studentDboMapper = studentDboMapper;
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        List<StudentEntity> studentEntityList = studentRepository.findAll();
        for (StudentEntity studentEntity : studentEntityList) {
            students.add(studentDboMapper.toDomain(studentEntity));
        }
        return students;
    }

}
