package com.example.demo.services;

import com.example.demo.entity.Evaluation;
import com.example.demo.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluationServices {
  @Autowired
  private EvaluationRepository evaluationRepository;

  public Evaluation createEvaluation(Evaluation evaluation) {
    return evaluationRepository.save(evaluation);
  }

  public List<Evaluation> createEvaluationList(List<Evaluation> list) {
    return evaluationRepository.saveAll(list);
  }

  public List<Evaluation> getEvaluationList() {
    return evaluationRepository.findAll();
  }

  public Evaluation getEvaluationById(int id) {
    return evaluationRepository.findById(id).orElse(null);
  }

  public Evaluation updateEvaluationById(Evaluation evaluation) {
    Optional<Evaluation> evaluationFound = evaluationRepository.findById(evaluation.getId());

    if (evaluationFound.isPresent()) {
      Evaluation evaluationUpdate = evaluationFound.get();
      evaluationUpdate.setWeekly(evaluation.getWeekly());
      evaluationUpdate.setTraineeAccount(evaluation.getTraineeAccount());
      evaluationUpdate.setTasks(evaluation.getTasks());
      evaluationUpdate.setProcessCompliance(evaluation.getProcessCompliance());
      evaluationUpdate.setTimeliness(evaluation.getTimeliness());
      evaluationUpdate.setWorkQuality(evaluation.getWorkQuality());
      evaluationUpdate.setProfessionalSkill(evaluation.getProfessionalSkill());
      evaluationUpdate.setTeamWork(evaluation.getTeamWork());
      evaluationUpdate.setAttitudeDiscipline(evaluation.getAttitudeDiscipline());
      evaluationUpdate.setAcademicMark(evaluation.getAcademicMark());
      evaluationUpdate.setDisciplinaryPoint(evaluation.getDisciplinaryPoint());
      evaluationUpdate.setComment(evaluation.getComment());
      evaluationUpdate.setBonus(evaluation.getBonus());
      evaluationUpdate.setPenalty(evaluation.getPenalty());
      evaluationUpdate.setBonusPenaltyReason(evaluation.getBonusPenaltyReason());
      evaluationUpdate.setFinalGrade(evaluation.getFinalGrade());

      return evaluationRepository.save(evaluationUpdate);
    } else {
      return null;
    }
  }

  public String deleteEvaluationById(int id) {
    evaluationRepository.deleteById(id);
    return "Evaluation" + id + " deleted";
  }
}