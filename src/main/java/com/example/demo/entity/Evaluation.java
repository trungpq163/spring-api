package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "evaluations")
public class Evaluation {
  @Id
  @GeneratedValue
  private int id;

  private int weekly;

  @Column(name = "trainee_account")
  private String trainee_account;

  @Column(name = "tasks")
  private String tasks;

  @Column(name = "process_compliance")
  private String process_compliance;

  @Column(name = "timeliness")
  private String timeliness;

  @Column(name = "work_quality")
  private String work_quality;

  @Column(name = "professional_skill")
  private String professional_skill;

  @Column(name = "team_work")
  private String team_work;

  @Column(name = "attitude_discipline")
  private String attitude_discipline;

  @Column(name = "academic_mark")
  private String academic_mark;

  @Column(name = "disciplinary_point")
  private String disciplinary_point;

  @Column(name = "comment")
  private String comment;

  @Column(name = "bonus")
  private String bonus;

  @Column(name = "penalty")
  private String penalty;

  @Column(name = "bonus_penalty_reason")
  private String bonus_penalty_reason;

  private int final_grade;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getWeekly() {
    return weekly;
  }

  public void setWeekly(int weekly) {
    this.weekly = weekly;
  }

  public String getTraineeAccount() {
    return trainee_account;
  }

  public void setTraineeAccount(String trainee_account) {
    this.trainee_account = trainee_account;
  }

  public String getTasks() {
    return tasks;
  }

  public void setTasks(String tasks) {
    this.tasks = tasks;
  }

  public String getProcessCompliance() {
    return process_compliance;
  }

  public void setProcessCompliance(String process_compliance) {
    this.process_compliance = process_compliance;
  }

  public String getTimeliness() {
    return timeliness;
  }

  public void setTimeliness(String timeliness) {
    this.timeliness = timeliness;
  }

  public String getWorkQuality() {
    return work_quality;
  }

  public void setWorkQuality(String work_quality) {
    this.work_quality = work_quality;
  }

  public String getProfessionalSkill() {
    return professional_skill;
  }

  public void setProfessionalSkill(String professional_skill) {
    this.professional_skill = professional_skill;
  }

  public String getTeamWork() {
    return team_work;
  }

  public void setTeamWork(String team_work) {
    this.team_work = team_work;
  }

  public String getAttitudeDiscipline() {
    return attitude_discipline;
  }

  public void setAttitudeDiscipline(String attitude_discipline) {
    this.attitude_discipline = attitude_discipline;
  }

  public String getAcademicMark() {
    return academic_mark;
  }

  public void setAcademicMark(String academic_mark) {
    this.academic_mark = academic_mark;
  }

  public String getDisciplinaryPoint() {
    return disciplinary_point;
  }

  public void setDisciplinaryPoint(String disciplinary_point) {
    this.disciplinary_point = disciplinary_point;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getBonus() {
    return bonus;
  }

  public void setBonus(String bonus) {
    this.bonus = bonus;
  }

  public String getPenalty() {
    return penalty;
  }

  public void setPenalty(String penalty) {
    this.penalty = penalty;
  }

  public String getBonusPenaltyReason() {
    return bonus_penalty_reason;
  }

  public void setBonusPenaltyReason(String bonus_penalty_reason) {
    this.bonus_penalty_reason = bonus_penalty_reason;
  }

  public int getFinalGrade() {
    return final_grade;
  }

  public void setFinalGrade(int final_grade) {
    this.final_grade = final_grade;
  }

  @Override
  public String toString() {
    return "Evaluation{" +
            "id=" + id +
            ", weekly=" + weekly +
            ", trainee_account='" + trainee_account + '\'' +
            ", tasks='" + tasks + '\'' +
            ", process_compliance='" + process_compliance + '\'' +
            ", timeliness='" + timeliness + '\'' +
            ", work_quality='" + work_quality + '\'' +
            ", professional_skill='" + professional_skill + '\'' +
            ", team_work='" + team_work + '\'' +
            ", attitude_discipline='" + attitude_discipline + '\'' +
            ", academic_mark='" + academic_mark + '\'' +
            ", disciplinary_point='" + disciplinary_point + '\'' +
            ", comment='" + comment + '\'' +
            ", bonus='" + bonus + '\'' +
            ", penalty='" + penalty + '\'' +
            ", bonus_penalty_reason='" + bonus_penalty_reason + '\'' +
            ", final_grade=" + final_grade +
            '}';
  }
}