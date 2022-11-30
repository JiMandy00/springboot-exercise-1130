package com.exercise.exercise1130.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @Test
    void name() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher krk = new Teacher("김경록", true, true);
        Teacher kgh = new Teacher("구경화", true, false);
        Teacher ksj = new Teacher("강수지", true, false);
        Teacher ksh = new Teacher("금선화", false, true);

        teachers.add(krk);
        teachers.add(kgh);
        teachers.add(ksj);
        teachers.add(ksh);

        // algorithm 좋아하는 선생님
        // DB에서 읽어왔습니다.
        List<Teacher> likeAlgorithmTeachers = teachers.stream()
                .filter(teacher -> teacher.isLikeAlgorithm() == true)
                .collect(Collectors.toList());

        for (Teacher teacher : likeAlgorithmTeachers) {
            System.out.println(teacher.getName());
        }

        System.out.println(likeAlgorithmTeachers);

        List<Teacher> likeSpringBootTeachers = teachers.stream()
                .filter(teacher -> teacher.isLikeSpringBoot() == true)
                .collect(Collectors.toList());

        for (Teacher teacher : likeSpringBootTeachers) {
            System.out.println(teacher.getName());
        }

        System.out.println(likeSpringBootTeachers);


    }