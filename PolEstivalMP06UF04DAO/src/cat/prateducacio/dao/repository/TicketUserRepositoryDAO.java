package cat.prateducacio.dao.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cat.prateducacio.dao.domain.TicketUser;

public class TicketUserRepositoryDAO extends BaseRepositoryDAO<TicketUser> {

	@Override
	public String getCommandInsert(TicketUser e) {
		StringBuilder sb = new StringBuilder();

		sb.append("INSERT INTO TicketsUser (title, mail) ");
		sb.append(" VALUES (");
		sb.append(" '" + e.getTitle() + "'");
		sb.append(", ");
		sb.append(" '" + e.getMail() + "'");
		sb.append(");");

		System.out.println(sb.toString());
		return sb.toString();
	}

	@Override
	public String getCommandUpdate(TicketUser e) {
		StringBuilder sb = new StringBuilder();

		sb.append("UPDATE TicketsUser ");
		sb.append("SET ");
		sb.append("title = '" + e.getTitle() + "'");
		sb.append(", ");
		sb.append("mail = '" + e.getMail() + "'");
		sb.append(" WHERE id=" + e.getId() + ";");

		return sb.toString();
	}

	@Override
	public String getCommandDelete(long id) {
		StringBuilder sb = new StringBuilder();

		sb.append("DELETE FROM TicketsUser");
		sb.append(" WHERE id=" + id + ";");

		return sb.toString();
	}

	@Override
	public List<TicketUser> getListFromResultSet(ResultSet rs) throws SQLException {
		List<TicketUser> result = new ArrayList<TicketUser>();
		while (rs.next()) {
			TicketUser t = new TicketUser();
			t.setId(rs.getLong(1));
			t.setTitle(rs.getString(2));
			t.setMail(rs.getString(3));
			result.add(t);

		}
		return result;
	}

	@Override
	public String getCommandGetAll() {
		return "SELECT * from TicketsUser";
	}

	@Override
	public String getCommandGetOne(long id) {
		return "SELECT * from TicketsUser WHERE id=" + id;
	}

}
