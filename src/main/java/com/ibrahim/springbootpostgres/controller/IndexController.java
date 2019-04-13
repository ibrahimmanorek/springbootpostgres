package com.ibrahim.springbootpostgres.controller;

import com.ibrahim.springbootpostgres.entity.Mahasiswa;
import com.ibrahim.springbootpostgres.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private IndexRepository indexRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<Mahasiswa> getMahasiswa(@PathVariable("id") Long id){
//        Mahasiswa mhs = new Mahasiswa();
//        mhs.setId(1L);
//        mhs.setUsername("Ibrahim");
//        mhs.setPassword("123456");
        List<Mahasiswa> list = indexRepository.findAllById(id);
        return list;
    }
}
