
public class EnemyBase extends Enemy {
	public EnemyBase(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
	public void move() {
		super.move();
		if (x < 100) { vx = 1; }
		if (300 < x) { vx = -1; }
		if (Math.random() < 0.05) {
			GameWorld.enemies.add(new StraightEnemy(x, y, 0, 2));
		}
		if (Math.random() < 0.05) {
			GameWorld.enemies.add(new RandomEnemy(x, y, 0, 1));
		}
	}
	public void draw(MyFrame f) {
		f.setColor(255, 20, 150);
		f.fillOval(x,  y, 40, 40);
	}
}
