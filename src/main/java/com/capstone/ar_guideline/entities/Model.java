package com.capstone.ar_guideline.entities;

import jakarta.persistence.*;
import java.io.Serializable;
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
public class Model implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @ManyToOne
  @JoinColumn(name = "modelType_id", nullable = false)
  private ModelType modelType;

  @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
  private List<Instruction> instructions;

  @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
  private List<ModelRequest> modelRequests;

  private String modelCode;
  private String status;
  private String name;
  private String description;
  private String image;
  private String documentUrl;
  private String aRUrl;
  private String version;
  private String rotation;
  private String scale;
  private String fileType;
  private Long fileSize;

  @Column(nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(nullable = false)
  @UpdateTimestamp
  private LocalDateTime updatedDate;
}
