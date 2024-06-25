package com.evaluation.symbol.repository;

import com.evaluation.symbol.model.Excuse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExcuseRepository extends JpaRepository<Excuse,Integer> {

}
