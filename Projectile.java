public class Projectile extends Obstacle {
  public int style;
  public String direction;
  public int speed;
  public int grid;
  public int hp;

  public String movement() {
    return direction;
  } 

  public int shootProjectiles() {
    return hp;
  }

  public int hit() {
    return hp;
  } 
}