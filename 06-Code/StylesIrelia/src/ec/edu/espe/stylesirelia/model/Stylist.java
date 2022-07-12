
package ec.edu.espe.stylesirelia.model;

import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class Stylist extends BasicModel {

    private String identificationCard;
    private String name;
    private int number;
    private float payment;
    private String appointment;
    private String address;

    public Stylist(String identificationCard, String name, int number, float payment, String appointment, String address) {
        this.identificationCard = identificationCard;
        this.name = name;
        this.number = number;
        this.payment = payment;
        this.appointment = appointment;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Stylist --> " + "identificationCard=" + identificationCard + ", name=" + name + ", number=" + number + ", payment=" + payment + ", appointment=" + appointment + ", address=" + address + "\n";
    }

    public void addAppointment() {

    }

    public void removeAppointment() {

    }

    public void editAppointment() {

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
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
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

    /**
     * @return the identificationCard
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * @param identificationCard the identificationCard to set
     */
    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    @Override
    public Document buildDocument() {
        Document document = new Document();

        document.append("identificationCard", this.identificationCard).
                append("name", this.name).
                append("number", this.number).
                append("payment", this.payment).
                append("appointment", this.appointment).
                append("adress", this.address);

        return document;
    }

}
