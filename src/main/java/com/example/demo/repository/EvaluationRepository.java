package com.example.demo.repository;

import java.util.List;
import com.example.demo.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
  List<Evaluation> findByWeekly(int weekly);
}
