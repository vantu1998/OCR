package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Card;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
