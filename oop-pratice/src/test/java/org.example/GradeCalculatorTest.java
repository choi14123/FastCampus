package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculatorTest {
    @DisplayName("평균학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("OOP", 3, "A+"));
        courses.add(new Course("자료구조", 3, "A+"));

         GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        Assertions.assertThat(gradeResult).isEqualTo(4.5);
    }
}
