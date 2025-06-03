package gamelogic.enemies;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gameengine.PhysicsObject;
import gameengine.hitbox.RectHitbox;
import gamelogic.GameResources;
import gamelogic.level.Level;
 
public class Dropper extends Enemy{
    private float jumpPower = 1000;
    //precondition - takes in an x, y and level where we want to draw the dropper. must be findable on a map
    //postcondition - draws the actual dropper on that spot.
    public Dropper(float x, float y, Level level) {
		  super(x, y, level);
      movementVector.y = jumpPower;
      movementVector.x = 0;
      this.image = GameResources.dropper;
	}
    //precondition - will allow the enemy to move up and down, depending on if there is space to move.
    //postcondition - makes the dropper move up and down, to potentially kill the player.
    @Override
    public void update(float tslf) {
		super.update(tslf);
		if(collisionMatrix[LEF] != null) {
			movementVector.x = 0;
		} else if(collisionMatrix[RIG] != null) {
			movementVector.x = 0;
		}
		if(collisionMatrix[TOP] != null) {
			movementVector.y = jumpPower;
		} else if(collisionMatrix[BOT] != null) {
			movementVector.y = -jumpPower;
		}
	}
}
