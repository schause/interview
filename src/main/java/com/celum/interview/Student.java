package com.celum.interview;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  // TODO make it mandatory
  private String name;

  // TODO for legacy reasons, this column should be called "dob" in the database
  private LocalDateTime dateOfBirth;

  // TODO we want to store this as string instead of an ordinal
  // TODO once this field is set, it must not be updatable
  private StudentType type;

}
