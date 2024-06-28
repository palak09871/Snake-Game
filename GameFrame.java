import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		// GamePanel panel=new GamePanel();
		// this.add(panel);
		this.add(new GamePanel()); // shortcut for above line
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // sizes the frame such that the components are at their preferenced size/ automatic adjustment
		this.setVisible(true);  // necessary to show contents in front of frame
		this.setLocationRelativeTo(null);  // sets the window in center
		
	}
}
