package Interfaces;
/**
 * Grid representing the state of Life
 * 
 * @author Austin Seto
 *
 */
public interface Grid {
  
  /**
   * Changes grid to next generation
   */
  public void nextGeneration();
  
  /**
   * Checks whether the cell at the given coordinates is alive or not
   * @param x x-coordinate of cell
   * @param y y-coordinate of cell
   * @return if cell is alive
   */
  public boolean isCellAlive(int x, int y);
  
  /**
   * Sets a given cell to the given state
   * @param x x-coordinate of cell
   * @param y y-coordinate of cell
   * @param state desired state of cell
   */
  public void setCell(int x, int y, boolean state);
  
  /**
   * @return length of grid
   */
  public int length();
  
  /**
   * @return width of grid
   */
  public int width();
}
