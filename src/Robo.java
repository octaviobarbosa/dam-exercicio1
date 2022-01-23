public class Robo {
	public boolean canRepeat = true;

	public void Responda(String pergunta) {
		if(pergunta.toUpperCase().equals("FIM")) {
			this.canRepeat = false;
			System.out.println("At� mais!");
			return;
		}
		
		boolean  isWordEu = false;
		boolean  isWordUpercase = false;
		String[] words = pergunta.split("\\s+");
		
		for (String string : words) {
			if(string.toUpperCase().equals("EU")) isWordEu = true;
			else if(string == string.toUpperCase()) isWordUpercase = true;
		}
		
		if(pergunta.isEmpty()) {
			System.out.println("N�o me incomode!");
		} else if(pergunta == pergunta.toUpperCase()) {
			System.out.println("Relaxa, eu sei o que estou fazendo!");return;
		} else if(isWordUpercase) {
			System.out.println("Opa! Calma a�!");return;
		} else if(isWordEu) {
			System.out.println("A responsabilidade � sua!");return;
		} else if(pergunta.contains("?")) {
			System.out.println("Certamente!");
		} else {
			System.out.println("Tudo bem, como quiser!");
		}
	}
}
