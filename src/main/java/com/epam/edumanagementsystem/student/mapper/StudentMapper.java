package com.epam.edumanagementsystem.student.mapper;

import com.epam.edumanagementsystem.student.model.dto.StudentDto;
import com.epam.edumanagementsystem.student.model.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {
    public static Student toStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setEmail(studentDto.getEmail());
        student.setDate(studentDto.getDate());
        student.setAddress(studentDto.getAddress());
        student.setBloodGroup(studentDto.getBloodGroup());
        student.setGender(studentDto.getGender());
        student.setGeneratePassword(studentDto.getGeneratePassword());
        student.setParent(studentDto.getParent());
        return student;
    }

    public static StudentDto toStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setSurname(student.getSurname());
        studentDto.setEmail(student.getEmail());
        studentDto.setDate(student.getDate());
        studentDto.setAddress(student.getAddress());
        studentDto.setBloodGroup(student.getBloodGroup());
        studentDto.setGender(student.getGender());
        studentDto.setGeneratePassword(student.getGeneratePassword());
        studentDto.setParent(student.getParent());
        return studentDto;
    }

    public static List<Student> toStudentList(List<StudentDto> studentDtos) {
        return studentDtos
                .stream()
                .map(StudentMapper::toStudent)
                .collect(Collectors
                        .toList());
    }

    public static List<StudentDto> toStudentDtoList(List<Student> studentEntities) {
        return studentEntities
                .stream()
                .map(StudentMapper::toStudentDto)
                .collect(Collectors
                        .toList());
    }
}
