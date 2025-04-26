package at.fhj.msd;

/**
 * Represents a liquid used in drinks or cocktails, including properties 
 * such as name, volume, and alcohol percentage.
 */
public class Liquid {
    
    /**
     * The name of the liquid.
     */
    private String name;
    
    /**
     * The volume of the liquid in liters.
     */
    private double volume;
    
    /**
     * The alcohol percentage of the liquid (e.g., 42 for 42% alcohol).
     */
    private double alcoholPercent;

    /**
     * Constructs a Liquid instance with the specified name, volume, and alcohol percentage.
     * 
     * @param name the name of the liquid
     * @param volume the volume of the liquid in liters
     * @param alcoholPercent the alcohol percentage of the liquid
     * @throws IllegalArgumentException if volume or alcoholPercent is negative
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        if (volume < 0) {
            throw new IllegalArgumentException("Volume cannot be negative.");
        }
        if (alcoholPercent < 0) {
            throw new IllegalArgumentException("Alcohol percentage cannot be negative.");
        }
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Retrieves the name of the liquid.
     * 
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the volume of the liquid in liters.
     * 
     * @return the volume of the liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid in liters.
     * 
     * @param volume the volume to set
     * @throws IllegalArgumentException if the volume is negative
     */
    public void setVolume(double volume) {
        if (volume < 0) {
            throw new IllegalArgumentException("Volume cannot be negative.");
        }
        this.volume = volume;
    }

    /**
     * Retrieves the alcohol percentage of the liquid.
     * 
     * @return the alcohol percentage of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of the liquid.
     * 
     * @param alcoholPercent the alcohol percentage to set
     * @throws IllegalArgumentException if the alcohol percentage is negative
     */
    public void setAlcoholPercent(double alcoholPercent) {
        if (alcoholPercent < 0) {
            throw new IllegalArgumentException("Alcohol percentage cannot be negative.");
        }
        this.alcoholPercent = alcoholPercent;
    }
}
