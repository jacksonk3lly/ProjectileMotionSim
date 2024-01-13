import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel {

	private JButton firebutton;
	private ActionPanel actpan;

	public MainPanel() {
		actpan = new ActionPanel();
		add(actpan);
		setPreferredSize(new Dimension(1000, 700));
		firebutton = new JButton("Fire");
		firebutton.addActionListener(new ButtonListener());
		add(firebutton);
	}

	public class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == firebutton) {
				actpan.fire();
			}
		}
	}
}