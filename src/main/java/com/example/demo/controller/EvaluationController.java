package com.example.demo.controller;

import com.example.demo.entity.Evaluation;
import com.example.demo.services.EvaluationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class EvaluationController {
  @Autowired
  private EvaluationServices services;

  @GetMapping("/evaluations")
  public ResponseEntity<List<Evaluation>> getAllEvaluations() {
    return ResponseEntity.ok(services.getEvaluationList());
  }

  @GetMapping("/evaluationById/{id}")
  public ResponseEntity<Evaluation> getEvaluationById(@PathVariable("id") int id) {
    return ResponseEntity.ok().body(this.services.getEvaluationById(id));
  }

  @GetMapping("/evaluationsByWeekly/{weekly}")
  public ResponseEntity<List<Evaluation>> getEvaluationsByWeekly(@PathVariable("weekly") int weekly) {
    return ResponseEntity.ok().body(this.services.getEvaluationsByWeekly(weekly));
  }

  @PostMapping("/addEvaluation")
  public ResponseEntity<Evaluation> addEvaluation(@RequestBody Evaluation evaluation) {
    return ResponseEntity.ok(this.services.createEvaluation(evaluation));
  }

  @PostMapping("/addEvaluations")
  public ResponseEntity<List<Evaluation>> addEvaluations(@RequestBody List<Evaluation> list) {
    return ResponseEntity.ok(this.services.createEvaluationList(list));
  }

  @PutMapping("/updateEvaluation")
  public ResponseEntity<Evaluation> updateEvaluation(@RequestBody Evaluation evaluation) {
    return ResponseEntity.ok().body(this.services.updateEvaluationById(evaluation));
  }

  @DeleteMapping("/deleteEvaluation/{id}") 
  public HttpStatus deleteEvaluation(@PathVariable("id") int id) {
    this.services.deleteEvaluationById(id);
    return HttpStatus.OK;
  }
}
