package in.nit.cfg;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.nit.dao.IStudentDAO;
import in.nit.dao.StudentDAOImpl;
import in.nit.service.IStudentService;
import in.nit.service.StudentServiceImpl;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig
{
	public AppConfig() {
		packages("in.nit");
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(StudentDAOImpl.class).to(IStudentDAO.class);
				bind(StudentServiceImpl.class).to(IStudentService.class);
			}
		});
	}
}


