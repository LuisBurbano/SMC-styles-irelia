package ec.edu.espe.stylesirelia.model;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Supplier {

    private String name;
    private String number;
    private boolean pendingPayment;
    private String appointment;
    private String address;

    public Supplier() {
    }

    public Supplier(String name, String number, boolean pendingPayment, String appointment, String address) {
        this.name = name;
        this.number = number;
        this.pendingPayment = pendingPayment;
        this.appointment = appointment;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" + "name=" + name + ", number=" + number + ", pendingPayment=" + pendingPayment + ", appointment=" + appointment + ", address=" + address + '}';
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
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
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
     * @return the appointment
     */
    public String getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
