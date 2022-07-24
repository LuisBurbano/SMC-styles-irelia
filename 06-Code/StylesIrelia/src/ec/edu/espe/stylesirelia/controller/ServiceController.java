package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Service;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class ServiceController extends BasicController<Service> {

    public ServiceController(Service object, String collectionName) {
        super(object, collectionName);
    }

    public Document buildDocument(Service service) {
        Document document = new Document();

        document.append("price", service.getPrice()).
                append("name", service.getName()).
                append("pendingPayment", service.isPendingPayment()).
                append("availableStylist", service.getAvailableStylist());

        return document;
    }

}
