import javax.swing.*;

public class Main {

	public static int actPanHeight = 500;
	public static double scale = 8;
	public static double delay = 50;
	public static double gravityMag = 9.81;

	public static void main(String[] args) {

		JFrame frame = new JFrame("projectileMotion");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(new MainPanel());
		frame.setVisible(true);
		frame.pack();
		frame.setResizable(false);
	}
}