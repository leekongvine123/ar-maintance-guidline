package com.capstone.ar_guideline.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Lesson {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL)
  private List<InstructionLesson> modelLessons;

  @OneToMany(mappedBy = "lesson", cascade = CascadeType.ALL)
  private List<LessonProcess> lessonProcesses;

  private String title;
  private Integer orderInCourse;
  private String description;
  private Integer duration;
  private String status;

  @PrePersist
    public void prePersist() {
    this.status = "ACTIVE";
  }

  @Column(nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime updatedDate;
}
