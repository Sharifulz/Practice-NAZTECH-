package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.Reader;

@Repository
public interface ReaderDao extends JpaRepository<Reader, Integer> {

}
