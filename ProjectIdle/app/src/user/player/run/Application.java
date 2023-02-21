package user.player.run;

import java.awt.Font;

import user.player.gamemain.GameMain;
import user.player.info.UserDeleteCheckPage;
import user.player.info.UserDeletePage;
import user.player.info.UserInfoPage;
import user.player.manager.IngreMaMain;
import user.player.rank.RankPage;
import user.player.storage.IngreStoragePage;
import user.player.storage.StoragePage;
import user.player.store.StoreMainPage;
import user.player.store.ingre.IngreMarketPage;
import user.player.store.receip.RecipeStoragePage;
import user.player.store.receip.StoreChoiceReceip;
import user.player.store.update.StoreChoiceUpdate;




public class Application {

	public static Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);
	public static Font middleFont = new Font("DungGeunMo", Font.PLAIN, 50);
	public static Font titleFont = new Font("DungGeunMo", Font.BOLD, 90);
	public static Font littlebigFont = new Font("DungGeunMo", Font.BOLD, 55);

	public static void main(String[] args) {
		//   new StoreMainPage();
		//    new SignUpPage();
		//   new StoreReceipPage();
		
		//   new StoreNCash();
//		 	 new StoreYCash();
//			new StoreChoiceReceip();
		// 	new StoreChoiceUpdate();
//			new IngreMaMain();
		//  new ManagerMainPage();
//			new RankPage();
//		new UserDeleteCheckPage();
//		new UserDeletePage();
//		new UserInfoPage();
//		new IngreStoragePage();
		new StoragePage();
//		new RecipeStoragePage();
//		new UserInfoPage();
//		new GameMain();
	}

}
