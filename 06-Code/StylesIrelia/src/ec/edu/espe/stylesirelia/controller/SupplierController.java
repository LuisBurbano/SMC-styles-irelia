package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Supplier;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class SupplierController extends BasicController<Supplier> {

    public SupplierController(Supplier object, String collectionName) {
        super(object, collectionName);
    }

    public Document buildDocument(Supplier supplier) {
        Document document = new Document();

        document.append("number", supplier.getNumber()).
                append("name", supplier.getName()).
                append("pendingPayment", supplier.isPendingPayment()).
                append("appointment", supplier.getAppointment()).
                append("address", supplier.getAddress());

        return document;
    }

}
