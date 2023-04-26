package com.app.assembler;

import com.app.dto.StudentDTO;
import com.app.entity.Student;

public class StudentDTOAssembler {

     public StudentDTO toDto(Student student) {
		
		StudentDTO studentDto=new StudentDTO();
		studentDto.setId(student.getStudent_code());
		studentDto.setName(student.getName());
		studentDto.setEmail(student.getEmail());
		studentDto.setMobile_no(student.getMobile_no());
		studentDto.setParents_name(student.getParents_name());
		studentDto.setAddresses(student.getAddresses());
		
		return studentDto;
     }
     
     public Student fromDto(StudentDTO studentDto) {
    	 
    	 Student student=new Student();
    	 student.setStudent_code(studentDto.getId());
    	 student.setName(studentDto.getName());
    	 student.setEmail(studentDto.getEmail());
    	 student.setMobile_no(studentDto.getMobile_no());
    	 student.setParents_name(studentDto.getParents_name());
    	 student.setAddresses(studentDto.getAddresses());
         return student;
         
     }
}