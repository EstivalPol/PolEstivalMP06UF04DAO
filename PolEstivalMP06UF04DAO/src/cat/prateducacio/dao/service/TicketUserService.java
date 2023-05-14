package cat.prateducacio.dao.service;

import java.sql.SQLException;
import java.util.List;

import cat.prateducacio.dao.domain.TicketUser;
import cat.prateducacio.dao.repository.TicketUserRepositoryDAO;

public class TicketUserService {

	private TicketUserRepositoryDAO rep;

	public TicketUserService() {
		rep = new TicketUserRepositoryDAO();
	}

	public int insert(TicketUser t) throws SQLException {
		checkData(t);
		return rep.insert(t);
	}

	public int update(TicketUser t) throws SQLException {
		checkData(t);
		return rep.update(t);
	}

	public int delete(long id) throws SQLException {
		return rep.delete(id);
	}

	public TicketUser getOne(long id) throws SQLException {
		return rep.getOne(id);

	}

	public List<TicketUser> getAll() throws SQLException {
		return rep.getAll();

	}
	
	private void checkData(TicketUser t)
	{
		if (t == null)
		{
			throw new RuntimeException("Ticket Empty.");
		}
		if (t.getTitle() == null || t.getTitle().equals(""))
		{
			throw new RuntimeException("Title Empty.");
		}
		if (t.getMail() == null || t.getMail().equals(""))
		{
			throw new RuntimeException("Mail Empty.");
		}
	}

}
