package jp.sourceforge.andjong.mahjong;

public class InfoUI extends Info {
	public InfoUI(Mahjong game) {
		super(game);
	}

	public Hai[] getDoraAll() {
		return game.getYama().getUraDoraHais();
	}

	public int getManKaze() {
		return game.getManKaze();
	}

	/**
	 * 手牌をコピーします。
	 *
	 * @param tehai
	 *            手牌
	 * @param kaze
	 *            風
	 */
	public void copyTehai(Tehai tehai, int kaze) {
		game.copyTehaiUi(tehai, kaze);
	}
}
