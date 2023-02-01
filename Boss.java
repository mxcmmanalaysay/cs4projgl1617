public class Boss extends Hostile {
  public String name;
  public int hp;
  public int maxHP;
  public int grid;
  public String direction;

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