import java.awt.*;

public class Projectile {
	private int x;
	private int y;
	private int xvel;
	private int yvel;
	private double gravityMag;
	private int mass = 5;
	private int time = 1;
	private int ystart;
	private int xstart;
	double scale = Main.scale;

	public Projectile(int x, int y) {
		this.x = x;
		this.y = y;
		xstart = x;
		ystart = y;
		gravityMag = Main.gravityMag;
	}

	public void setvel(int xvel, int yvel) {
		this.xvel = xvel;
		this.yvel = yvel;

	}

	public void setGrav(int gravityMag) {
		this.gravityMag = gravityMag;
	}

	public void nextFrame(double time) {
		x = getX(time);
		y = getY(time);
	}

	public int getX(double time) {
		time = time / 1000;
		x = (int) (xstart + time * xvel);
		return x;
	}

	public int getY(double time) {
		time = time / 1000;
		y = (int) (ystart + yvel * time - (.5 * gravityMag * time * time));
		return y;
	}

	public void display(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillOval((int) scale * x, Main.actPanHeight - (int) scale * (y), 20, 20);
	}
}