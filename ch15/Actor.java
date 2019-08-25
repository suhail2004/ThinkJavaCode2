import java.awt.Graphics;

/**
 * Graphical simulation element.
 */
public interface Actor {

    /**
     * Updates the state of the simulation element.
     */
    void act();

    /**
     * Paints the simulation element in the context.
     * 
     * @param g graphics context
     */
    void draw(Graphics g);

}
