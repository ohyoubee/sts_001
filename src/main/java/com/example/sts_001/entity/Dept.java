package com.example.sts_001.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "dept")
public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long empno;         //사원
    private Long deptno;
    private String location;
    private String deptname;
    private String name;
    private String isworking;  // 출근,출근전
}
