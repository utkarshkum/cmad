import static org.junit.Assert.*;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pagenotfound.model.User;
import com.pagenotfound.service.UsersDB;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;


public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testLogin() throws IOException
	{
		/*
	    String URL_LOGIN = "http://localhost:8080/CMADWebApp/services";
	    Client client = Client.create();

	    String username = "admin";
	    String password = "admin123";

	    final HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter(username, password);
	    client.addFilter(authFilter);
	    client.addFilter(new LoggingFilter());

	    WebResource webResource = client.resource(URL_LOGIN);
	    // I even tried:
	    // webResource.header("Authorization", "Basic " + "base64encoded_userid:password").type("application/xml");

	    String page = webResource.post(String.class);

	    System.out.println(page);
	    */
	}

	@Test
	public void test() {
		
		UsersDB udb = new UsersDB();
		
		User testUser = new User();
		
		

	}

}
