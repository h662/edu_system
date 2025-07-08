package com.h662.edu_system_2.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private Integer id;
    private String name;
    private Integer score;
    private Integer teacherId;
    private String teacherName;
}
