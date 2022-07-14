package ec.edu.espe.stylesirelia.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Connection {

    public static MongoDatabase mongodb = null;

    public MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://danilo:danilo123@cluster0.smxif.mongodb.net/?retryWrites=true&w=majority";
            String db = "debe";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
