import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		UserAction acaoUsuario = new UserAction();
		RoboPremium robo = new RoboPremium(acaoUsuario);
		
		System.out.println("Ol�, meu nome � Marciano, me pergunte algo!");
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
			
			System.out.print("Digite sua pergunta: ");
			String input = reader.readLine();
			
			robo.Responda(input);
			
			while(robo.canRepeat) {
				System.out.print("Me fa�a outra pergunta: ");
				input = reader.readLine();
				robo.Responda(input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
