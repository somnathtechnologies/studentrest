package in.nit.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import in.nit.error.ErrorResponse;
import in.nit.model.Student;
import in.nit.service.IStudentService;

@Path("/Student")
public class StudentRestController {
	@Inject
	private IStudentService service;
	@GET
	@Produces("application/json")
	public Response showAllStudents() {
		Response resp=null;
		try {
			List<Student> list=service.getAllStudents();
			if(list==null || list.isEmpty()) {
				//resp=Response.status(204).build();
				resp=Response
						.status(200)
						.entity(new ErrorResponse(
								"NO DATA", 
								"No Records Found At Producer")).build();
			}else {
				resp=Response
						.status(200).entity(list).build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp=Response
					.status(500)
					.entity(e.getMessage())
					.build();
		}
		return resp;
	}
	@POST
	@Consumes("application/json")
	public Response saveStudent(Student s) {
		Response resp=null;
		try {
			Integer id=service.saveStudent(s);
			resp=Response
					.status(200)
					.entity(new StringBuffer()
							.append("SAVED WITH ID::")
							.append(id)
							.toString()
							)
					.build();
		} catch (Exception ex) {
			resp=Response.status(
					Status.INTERNAL_SERVER_ERROR)
					.entity(ex.getMessage())
					.build();
			ex.printStackTrace();
		}
		return resp;
	}
}


