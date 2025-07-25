package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Boots extends Entity{
	
	public OBJ_Boots(GamePanel gp) {
		super(gp);
		
		name = "Boots";
		down1 = setup("/objects/boots", gp.tileSize, gp.tileSize);
		description = "A pair of boots blessed by the God of Speed.";
		price = 200;
	}
}
