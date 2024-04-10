package com.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoServiceRepository extends JpaRepository<Student, Long> {

}
