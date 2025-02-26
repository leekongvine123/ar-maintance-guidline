package com.capstone.ar_guideline.dtos.requests.Result;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ResultCreationRequest {
  String quizId;
  String useId;
}
