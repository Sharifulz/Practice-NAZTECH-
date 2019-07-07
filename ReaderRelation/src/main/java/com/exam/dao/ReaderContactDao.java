package com.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.ReaderContact;

@Repository
public interface ReaderContactDao extends JpaRepository<ReaderContact, Integer> {

}
