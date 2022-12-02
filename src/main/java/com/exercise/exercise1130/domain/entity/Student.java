package com.exercise.exercise1130.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private String name;
    private boolean isLikeAlgorithm;
    private boolean isLikeSpringBoot;
}
