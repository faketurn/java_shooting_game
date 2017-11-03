import java.util.Vector;

/**
 * GameFrameはさまざまなキャラクタをフレーム上に出現させておく
 * @author syoji
 *
 */

public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player = new Player(100, 300, 0, 0);
		// イベントリスナー登録
		addKeyListener(GameWorld.player);
		GameWorld.playerBullets = new Vector<PlayerBullet>();

		int autoShootInterval = 0;
		while(true) {
			clear();
			GameWorld.player.draw(this);
			GameWorld.player.move();
			movePlayerBullets(autoShootInterval);
			sleep(0.03);
			autoShootInterval += 1;
		}
	}
	public void movePlayerBullets(int autoShootInterval) {
		if (autoShootInterval % 3 == 0) {
			GameWorld.player.shoot();
		}
		int i = 0;
		while (i < GameWorld.playerBullets.size()) {
			PlayerBullet b = GameWorld.playerBullets.get(i);
			b.draw(this);
			b.move();
			if (b.y < 0) {
				GameWorld.playerBullets.remove(i);
			} else {
				i++;
			}
		}
	}
}
