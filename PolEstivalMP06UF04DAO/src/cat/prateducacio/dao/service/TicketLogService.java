package cat.prateducacio.dao.service;

import java.sql.SQLException;
import java.util.List;

import cat.prateducacio.dao.domain.TicketLog;
import cat.prateducacio.dao.repository.TicketLogRepositoryDAO;
import cat.prateducacio.dao.repository.TicketUserRepositoryDAO;

public class TicketLogService {

	private TicketLogRepositoryDAO rep;

	public TicketLogService() {
		rep = new TicketLogRepositoryDAO();
	}

	public int insert(TicketLog t) throws SQLException {
		checkData(t);
		return rep.insert(t);
	}

	public int update(TicketLog t) throws SQLException {
		checkData(t);
		return rep.update(t);
	}

	public int delete(long id) throws SQLException {
		return rep.delete(id);
	}

	public TicketLog getOne(long id) throws SQLException {
		return rep.getOne(id);
	}

	public List<TicketLog> getAll() throws SQLException {
		return rep.getAll();
	}
	
	private void checkData(TicketLog t) {
		if (t == null) {
			throw new RuntimeException("Ticket Empty.");
		}
		if (t.getTitle() == null || t.getTitle().equals("")) {
			throw new RuntimeException("Title Empty.");
		}
		if (t.getApplication() == null || t.getApplication().equals("")) {
			throw new RuntimeException("Mail Empty.");
		}
	}
}
