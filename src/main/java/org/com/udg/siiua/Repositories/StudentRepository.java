package org.com.udg.siiua.Repositories;


import org.com.udg.siiua.Models.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long> {

    public Optional<ArrayList<StudentModel>> findStudentModelByCode(String code);

    public Optional<ArrayList<StudentModel>> findStudentModelByName(String name);
}