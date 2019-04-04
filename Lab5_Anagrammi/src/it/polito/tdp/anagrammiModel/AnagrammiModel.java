package it.polito.tdp.anagrammiModel;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class AnagrammiModel {

	public List<String> Anagramma(String parola) {
		List<String> soluzioni = new ArrayList<>();
		doAnagramma ca = new doAnagramma();
		ca.genera(parola);
		soluzioni.addAll(ca.getSoluzioni());
		DizionarioDAO dao = new DizionarioDAO();
		List<String> corrette = dao.getParoleCorrette(soluzioni);
		return ca.getSoluzioni();
	}
	
	public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);
    }
	
	

}
