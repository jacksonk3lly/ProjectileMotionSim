import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ActionPanel extends JPanel {
	Projectile proj;
	private int scale;
	long[] time = { 0 };

	public ActionPanel() {
		setPreferredSize(new Dimension(1000, Main.actPanHeight));
		setBackground(Color.BLACK);
		proj = new Projectile(20, 20);
		proj.setvel(17, 17);
	}

	public void fire() {
		Timer timer = new Timer();
		double delay = Main.delay;
		timer.schedule(new TimerTask() {
			public void run() {
				time[0] += delay;
				System.out.println(time[0]);
				proj.nextFrame(time[0]);
				repaint();
			}
		}, (long) 0, (long) delay);
	}

	// public void fire() {
	// double delay = Main.delay;
	// time[0] += delay;
	// System.out.println(time[0]);
	// proj.nextFrame(time[0]);
	// repaint();
	// }

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		proj.display(g);
	}

	public int getScale() {
		return scale;
	}
}