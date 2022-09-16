package com.celum.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO introduce Git & start version controlling your solution (.gitignore for build and IDE related files would be a good decision)

// TODO structure the classes into packages

// TODO implement Course entity and allow assignment of students to courses (N:M):
// - course has mandatory fields: name, startDate
// - no more than X students can be assigned to a course, where X is a value defined in application.properties (application.course-limit)

// TODO testing things is a good idea :-)

@SpringBootApplication
public class InterviewApplication {

  public static void main(String[] args) {
    SpringApplication.run(InterviewApplication.class, args);
  }

}
