package com.exercise.exercise1130.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teacher {
    private String name;
    private boolean isLikeAlgorithm;
    private boolean isLikeSpringBoot;
}
