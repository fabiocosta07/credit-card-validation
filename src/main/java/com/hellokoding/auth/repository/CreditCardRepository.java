package com.hellokoding.auth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hellokoding.auth.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
    List<CreditCard> findByNumberContaining(String number);
    
    @Query("Select c from CreditCard c where c.user.username = :username")
    List<CreditCard> findByUserName(@Param("username") String userName);
}