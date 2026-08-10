/*******************************************************************
 * Name: Brian Taylor
 * Date: August 7, 2026
 * Assignment: SDC330 Performance Assessment - Interface
 *
 * Vehicle is an interface that defines the required behavior for
 * vehicle classes. Any class implementing Vehicle must provide
 * methods to return its make and model, start and stop the vehicle,
 * and assign a driving destination.
 */

public interface Vehicle {

    public String getMake();

    public String getModel();

    public void start();

    public void stop();

    public void drive(String destination);
}