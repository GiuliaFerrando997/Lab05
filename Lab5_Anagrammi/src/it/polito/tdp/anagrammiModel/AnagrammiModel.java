package it.polito.tdp.anagrammiModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class AnagrammiModel {
	
	List<String> paroleCorrette = new ArrayList<>();
	List<String> soluzioni = new ArrayList<>();

	public List<String> Anagramma(String parola) {
		doAnagramma ca = new doAnagramma();
		ca.genera(parola);
		soluzioni.addAll(ca.getSoluzioni());
		DizionarioDAO dao = new DizionarioDAO();
		paroleCorrette = dao.getParoleCorrette(soluzioni);
		return paroleCorrette;
	}
	
	public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);
    }

	public Collection<String> paroleErrate(String parola) {
		this.Anagramma(parola);
		this.soluzioni.remove(this.paroleCorrette);
		return soluzioni;
	}
	
	

}
