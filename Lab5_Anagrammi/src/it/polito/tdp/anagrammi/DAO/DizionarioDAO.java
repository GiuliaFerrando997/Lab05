package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DizionarioDAO {

	public List<String> getParoleCorrette(List<String> soluzioni) {
			Connection conn = ConnectDB.getConnection();
			List<String> paroleCorrette = new LinkedList<>();
				try {
					String sql = "SELECT nome FROM parola WHERE nome=?";
					
					PreparedStatement st = conn.prepareStatement(sql);
					for(String word : soluzioni) {
						st.setString(1, word);
					}
					ResultSet rs = st.executeQuery();
					
					while(rs.next()) {
						
						String s = rs.getString("nome");
						if(s!=null)
						paroleCorrette.add(s);
					}
				
					conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				return paroleCorrette;
		}

}
