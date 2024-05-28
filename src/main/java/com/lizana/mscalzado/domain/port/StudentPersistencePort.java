package com.lizana.mscalzado.domain.port;


import com.lizana.mscalzado.domain.model.Student;

import java.util.List;


public interface StudentPersistencePort {

    List<Student> getAll();


}
