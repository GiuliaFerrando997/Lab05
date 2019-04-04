package it.polito.tdp.anagrammiModel;

import java.util.ArrayList;
import java.util.List;

public class doAnagramma {
	
	private List<String> soluzioni; 
	
	public void genera(String parola) {
		Anagramma parziale = new Anagramma(null);
		Anagramma finale = new Anagramma(parola);
		this.soluzioni= new ArrayList<>();
		this.cerca(parziale, 0, finale);
	}
	
	List<String> getSoluzioni(){
		return soluzioni;
	}
	
	private void cerca(Anagramma parziale, int L, Anagramma finale) {
		char c='c';
				if(L==finale.getIniziale().length() 
						&& !this.soluzioni.contains(parziale.getIniziale())){
						soluzioni.add(parziale.getIniziale());
						return;
					}
				
				for(int i=0; i<finale.getIniziale().length(); i++) {
					c=finale.getIniziale().charAt(i);
					if(parziale.getSpell(c) < finale.getSpell(c)) {
							parziale.setSpell(c);
							parziale.setIniziale(c);
							this.cerca(parziale, L+1, finale);
							
							parziale.togliLettera(c);
							parziale.togliSpell(c);
						
					}
				}
	}

	private int factorial(int n) {
		int result=1;
		for(int i=2;i<=n;i++)
        {
            result=result*i;
        }
		return result;
	}
}
