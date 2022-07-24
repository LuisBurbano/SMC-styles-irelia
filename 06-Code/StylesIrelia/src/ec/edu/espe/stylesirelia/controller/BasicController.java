package ec.edu.espe.stylesirelia.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import static com.mongodb.client.model.Updates.set;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
class BasicController<T> {

    T model;
    private MongoDatabase mongoDB = Connection.mongodb;

    private MongoCollection<Document> mongoCollection;

    public BasicController(T object, String collectionName) {
        this.model = object;
        this.mongoCollection = mongoDB.getCollection(collectionName);
    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public void create(Document document)  {

        

        mongoCollection.insertOne(document);

    }

    public Document read(String id) {

        return mongoCollection.find(eq(id)).first();
    }

    public void delete(String id, Object idValue) {
        mongoCollection.deleteOne(eq(id, idValue));

    }

    public void update(String id, String idValue, String updateKey, String valueUpdate) {

        getMongoCollection().updateOne(eq(id, idValue), set(updateKey, valueUpdate));

    }
     public void update(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);

        mongoCollection.replaceOne(query, upload, options);
    }

}
