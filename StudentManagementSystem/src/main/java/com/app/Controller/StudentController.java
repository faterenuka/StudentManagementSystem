package com.app.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.assembler.StudentDTOAssembler;
import com.app.dto.StudentDTO;
import com.app.entity.Student;
import com.app.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	StudentDTOAssembler studentAssembler;
	
	@GetMapping("/student")
    public ResponseEntity<StudentDTO> getStudentById(@RequestParam Integer studentId) throws Exception{
    	
    	Student student=studentService.getStudentById(studentId);
    	return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student), HttpStatus.OK);
    }
	
	@PostMapping("/student")
	public ResponseEntity<StudentDTO> addStudent(@RequestBody StudentDTO studentDto) throws Exception {
		
		Student student=studentAssembler.fromDto(studentDto);
		student=studentService.addStudent(student);
		return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student),HttpStatus.OK);
	}
	
	@PutMapping("/student")
	public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDto) throws Exception{
		
		Student student=studentAssembler.fromDto(studentDto);
		student=studentService.updateStudent(student);
		return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student),HttpStatus.OK);
	}
	
	@DeleteMapping("/student")
	public ResponseEntity<StudentDTO> removeStudent(@RequestParam Integer studentId) throws Exception{
		
		Student student=studentService.removeStudent(studentId);
		return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student), HttpStatus.OK);
	}
	
	@GetMapping("/student/course")
	public ResponseEntity<StudentDTO> mapCoursesToStudent(@RequestParam List<Integer> courseIds,@RequestParam Integer studentId) throws Exception{
		
		Student student=studentService.mapCoursesToStudent(courseIds, studentId);
		return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student), HttpStatus.OK);
	}
	
	@DeleteMapping("/student/course")
	public ResponseEntity<StudentDTO> removeCourseFromStudent(@RequestParam  Integer studentId,@RequestParam List<Integer> courseIds) throws Exception{
		
		Student student=studentService.removeCourseFromStudent(studentId, courseIds);
		return new ResponseEntity<StudentDTO>(studentAssembler.toDto(student), HttpStatus.OK);
	}
	
}
