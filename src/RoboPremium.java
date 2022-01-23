interface CustomAction {
	void Action();
}

public class RoboPremium extends RoboAvancado {	
	private CustomAction customAction;
	
	RoboPremium(CustomAction customAction) {
		this.customAction = customAction;
	}
	
	@Override 
	public void Responda(String pergunta)  {		
		if(pergunta.toUpperCase().equals("AGIR")) {
			System.out.println("� pra j�!" );
			customAction.Action();
		} else {
			super.Responda(pergunta);
		}
	}
}
