package ec.edu.espe.stylesirelia.controller;

import ec.edu.espe.stylesirelia.model.Commerce;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class CommerceController extends BasicController {

    public CommerceController(Commerce object, String collectionName) {

        super(object, collectionName);
    }

    public CommerceController() {
        super(new Commerce(), "commerces");
    }
    

    public Document buildDocument(Commerce commerce) {
        Document document = new Document();

        document.append("name", commerce.getName()).
                append("direction", commerce.getDirection());
        return document;
    }
}
