import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		
		GamePanel panel = new GamePanel();
		this.add(panel); 
		this.setTitle("The Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.pack();
		//this.setSize(1080,720);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}


//Press any key to restart
//pause and resume button (clicking)
//321 countdown
//bomb
//acceleration
//deceleration
//constantly change bg
//audio
//no wall