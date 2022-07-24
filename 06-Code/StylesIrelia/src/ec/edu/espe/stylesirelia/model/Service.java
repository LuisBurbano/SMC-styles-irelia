package ec.edu.espe.stylesirelia.model;

import ec.edu.espe.stylesirelia.controller.BasicModel;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Service  {

    private String name;
    private String price;
    private boolean pendingPayment;
    private boolean available;
    private String availableStylist;

    public Service() {
    }


    
    

    public Service(String name, String price, boolean pendingPayment, boolean available, String availableStylist) {
        this.name = name;
        this.price = price;
        this.pendingPayment = pendingPayment;
        this.available = available;
        this.availableStylist = availableStylist;
    }

    @Override
    public String toString() {
        return "Service{" + "name=" + name + ", price=" + price + ", pendingPayment=" + pendingPayment + ", available=" + available + ", availableStylist=" + availableStylist + '}';
    }

    public String toStringData() {
        return name + "," + pendingPayment + "," + available + "," + availableStylist;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the pendingPayment
     */
    public boolean isPendingPayment() {
        return pendingPayment;
    }

    /**
     * @param pendingPayment the pendingPayment to set
     */
    public void setPendingPayment(boolean pendingPayment) {
        this.pendingPayment = pendingPayment;
    }

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the availableStylist
     */
    public String getAvailableStylist() {
        return availableStylist;
    }

    /**
     * @param availableStylist the availableStylist to set
     */
    public void setAvailableStylist(String availableStylist) {
        this.availableStylist = availableStylist;
    }

}
