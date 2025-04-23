package utilz;

public class Constants {
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING = 1;
		public static final int JUMP = 2;
		public static final int FALLING = 3;
		public static final int ATTACK = 4;
		public static final int HIT = 5;
		public static final int DEAD = 6;


		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case RUNNING:
				return 6;
			case IDLE:
				return 6;
			case JUMP:
				return 3;
			case FALLING:
				return 1;
			case ATTACK:
				return 3;
			case HIT:
				return 4;
			case DEAD:
			default:
				return 4;
			}
		}
	}

}
