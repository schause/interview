package com.celum.interview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {

  // TODO it is not recommended to work with repositories within controllers - introduce a service layer

  // TODO by default, deserialization will fail when an unknown field is found - make it more tolerant (unknown fields should be ignored)

  // TODO this controller should not expose the domain objects directly

  // TODO log all controller method calls using AOP

  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("{studentId:\\d+}")
  public Student getStudent(@NotNull @PathVariable("studentId") Long studentId) {
    return studentRepository.findById(studentId)
                            // TODO return HTTP status 404 instead of 500 (think about global exception handling)
                            .orElseThrow();
  }

  @PostMapping
  public Student postStudent(@NotNull @RequestBody Student student) {
    log.info("Saving student {}", student);
    // TODO this method should not allow to overwrite existing student

    // TODO when a new Student is created, enroll him into any available Course automatically
    //  - try to reduce coupling between services (hint: ApplicationEvents)
    return studentRepository.save(student);
  }

  @PutMapping
  public Student putStudent(@NotNull Student student) {
    // TODO implement student update
    return null;
  }

}
