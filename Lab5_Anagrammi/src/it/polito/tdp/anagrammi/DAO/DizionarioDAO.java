package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DizionarioDAO {

	public boolean getParoleCorrette(String soluzioni) {
			Connection conn = ConnectDB.getConnection();
			boolean trovata = false;
				try {
					String sql = "SELECT nome FROM parola WHERE nome=?";
					
					PreparedStatement st = conn.prepareStatement(sql);
					st.setString(1, soluzioni);
					ResultSet rs = st.executeQuery();
					
					while(rs.next()) {
						String s = rs.getString("nome");
						if(s.equals(soluzioni))
						trovata= true;
						}
				
					conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return trovata;
		}

}
