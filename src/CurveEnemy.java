
public class CurveEnemy extends Enemy {
	public CurveEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life = 6;
	}
	public void move() {
		super.move();
		if (x < GameWorld.player.x) {
			x++;
		} else {
			x--;
		}
	}
	public void draw(MyFrame f) {
		f.setColor(255, 190, 180);
		f.fillRect(x, y, 22, 22);
	}
}
