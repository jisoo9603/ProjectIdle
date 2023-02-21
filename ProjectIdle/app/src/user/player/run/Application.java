package user.player.run;

import java.awt.Font;

import user.player.realplay.PlayMain;

public class Application {

	public static Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
	public static Font middleFont = new Font("DungGeunMo", Font.PLAIN, 50);
	public static Font titleFont = new Font("DungGeunMo", Font.BOLD, 90);
	public static Font littlebigFont = new Font("DungGeunMo", Font.BOLD, 55);

	public static void main(String[] args) {
		//new StoreMainPage();
		//new SignUpPage();
		//new StoreReceipPage();
		//new StoreNCash();
		//new StoreYCash();
		//new StoreChoiceReceip();
		//new StoreChoiceUpdate();
		//new IngreMaMain();
		//new ManagerMainPage();
		//new RankPage();
		//new UserDeleteCheckPage();
		new PlayMain();
	}
}
