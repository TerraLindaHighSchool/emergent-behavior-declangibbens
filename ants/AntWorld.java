import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        AntHill antHill = new AntHill();
        addObject(antHill,510,118);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,146,515);
        Food food = new Food();
        addObject(food,68,148);
        Food food2 = new Food();
        addObject(food2,504,569);
        Food food3 = new Food();
        addObject(food3,445,299);
        Food food4 = new Food();
        addObject(food4,197,344);
    }
}
