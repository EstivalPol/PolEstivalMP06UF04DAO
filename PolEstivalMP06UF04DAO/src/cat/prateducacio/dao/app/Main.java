package cat.prateducacio.dao.app;

import java.sql.SQLException;
import java.util.List;

import cat.prateducacio.dao.domain.TicketLog;
import cat.prateducacio.dao.domain.TicketUser;
import cat.prateducacio.dao.service.TicketUserService;
import cat.prateducacio.dao.service.TicketLogService;

public class Main {

	public static void main(String[] args) throws SQLException {

		//testTicketUser();
		testTicketLog();

	}
	
	private static void testTicketUser() throws SQLException
	{
		TicketUserService s = new TicketUserService();
		TicketUser t = new TicketUser();
		t.setMail("aaa@aaa.com");
		t.setTitle("aaa bbb cccc");
		

		s.insert(t);
		
		t.setId(1);
		t.setMail("ccc@cccc.eu");
		s.update(t);
		
		s.delete(t.getId());

		t = s.getOne(3);
		if (t != null) {
			System.out.println(t.toString());
		}

		System.out.println("----ALL");
		List<TicketUser> l = s.getAll();
		if (l != null && !l.isEmpty()) {
			for (TicketUser ticket : l) {
				System.out.println(ticket.toString());

			}
		}
	}

	private static void testTicketLog() throws SQLException {
	    TicketLogService s = new TicketLogService();
	    TicketLog t = new TicketLog();
	    t.setApplication("daoapp");
	    t.setTitle("dao");
	    t.setApplication("dao@test.com");

	    s.insert(t);

	    t.setApplication("mynewdao");
	    s.update(t);

	    s.delete(t.getId());

	    t = s.getOne(2);
	    if (t != null) {
	        System.out.println(t.toString());
	    }

	    System.out.println("----ALL");
	    List<TicketLog> l = s.getAll();
	    if (l != null && !l.isEmpty()) {
	        for (TicketLog ticket : l) {
	            System.out.println(ticket.toString());
	        }
	    }
	}

	}
