package br.com.fiuza.controller;

import br.com.fiuza.entity.StudentEntity;
import br.com.fiuza.model.Student;
import br.com.fiuza.service.StudentService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/student")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentController {

    @Inject
    StudentService studentService;

    @GET
    public List<Student> get() {
        return studentService.get();
    }

    @POST
    public StudentEntity create(Student student) {
        StudentEntity studentEntity = studentService.create(student);
        return studentEntity;
    }

    @PUT
    public StudentEntity update(Student student) {
        StudentEntity studentEntity = studentService.update(student);
        return studentEntity;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        studentService.delete(id);
    }

}
