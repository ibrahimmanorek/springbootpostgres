package com.ibrahim.springbootpostgres.repository;

import com.ibrahim.springbootpostgres.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexRepository extends JpaRepository<Mahasiswa, Long> {
    List<Mahasiswa> findAllById(Long id);
}
