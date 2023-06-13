package com.rspbank.departmentservice.model;

public record Employee(Long id, Long departmentId, String name,int age, String position) {
}

//record is final, and creates the entities only with constructor and getter but no setter
