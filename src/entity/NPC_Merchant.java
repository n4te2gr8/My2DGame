package entity;

import main.GamePanel;
import object.OBJ_Axe;
import object.OBJ_Boots;
import object.OBJ_Key;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import object.OBJ_Shield_Wood;
import object.OBJ_Sword_Normal;

public class NPC_Merchant extends Entity{
	public NPC_Merchant(GamePanel gp) {
		super(gp);
		
		direction = "down";
		speed = 1;
		
		getImage();
		setDialogue();
		setItems();
	}
	public void getImage() {
		
		up1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
		up2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
		down1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
		down2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
		left1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
		left2 = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
		right1 = setup("/npc/merchant_down_1", gp.tileSize, gp.tileSize);
		right2  = setup("/npc/merchant_down_2", gp.tileSize, gp.tileSize);
	}
	
	public void setDialogue() {
		dialogues[0][0] = "Welcome to my store!\nTake a look around \nlet me know if you need anything.";
		dialogues[1][0] = "See you around!";
		dialogues[2][0] = "You need more coins to buy that!";
		dialogues[3][0] = "You cannot carry any more!";
		dialogues[4][0] = "You cannot sell an equipped item!";	
	}
	
	public void setItems() {
		
		inventory.add(new OBJ_Potion_Red(gp));
		inventory.add(new OBJ_Key(gp));
		inventory.add(new OBJ_Sword_Normal(gp));
		inventory.add(new OBJ_Axe(gp));
		inventory.add(new OBJ_Shield_Wood(gp));
		inventory.add(new OBJ_Shield_Blue(gp));
	}
	
	public void speak() {
		facePlayer();
		gp.gameState = gp.tradeState;
		gp.ui.npc = this;
	}
}
