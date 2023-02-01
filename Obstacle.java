public abstract class Obstacle {
  public int style;
  public String direction;
  public int grid;
  public int hp;

  public int hit() {
    return hp;
  }
}