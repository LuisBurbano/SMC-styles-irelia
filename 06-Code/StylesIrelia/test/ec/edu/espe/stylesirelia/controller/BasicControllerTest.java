/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.stylesirelia.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.stylesirelia.model.Stylist;
import org.bson.types.ObjectId;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class BasicControllerTest {
    
    public BasicControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parseJsonToClass method, of class BasicController.
     */
    @Test
    public void testParseJsonToClass() {
        System.out.println("parseJsonToClass");
        Document document = null;
        BasicController instance = null;
        Object expResult = null;
        Object result = instance.parseJsonToClass(document);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMongoCollection method, of class BasicController.
     */
    @Test
    public void testGetMongoCollection() {
        System.out.println("getMongoCollection");
        BasicController instance = null;
        MongoCollection expResult = null;
        MongoCollection result = instance.getMongoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class BasicController.
     */
    @Test
    public void testCreate() {
        Connection.connectionDataBase();
        
        System.out.println("create");
        Document document = null;
        BasicController instance = null;
        instance.create(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class BasicController.
     */
    @Test
    public void testRead_String_String() {
        Connection.connectionDataBase();
        StylistController stylistController = new StylistController();
        
        
        System.out.println("read");
        String id = "1755231683";
        String fieldName = "identificationCard";
        
        Document expResult = new Document();
        expResult.append("_id",new ObjectId("62da0cca5d5a16610efa0234"))
                .append("identificationCard", "1755231683").append("name", "Mero")
                .append("number", "12")
                .append("payment", 12)
                .append("appointment", "13-07-2022")
                .append("addres", "asd");
        Document result = stylistController.read(id, fieldName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class BasicController.
     */
    @Test
    public void testRead_Document() {
        System.out.println("read");
        Document document = null;
        BasicController instance = null;
        Document expResult = null;
        Document result = instance.read(document);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BasicController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        Object idValue = null;
        BasicController instance = null;
        instance.delete(id, idValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BasicController.
     */
    @Test
    public void testUpdate_4args() {
        System.out.println("update");
        String id = "";
        String idValue = "";
        String updateKey = "";
        String valueUpdate = "";
        BasicController instance = null;
        instance.update(id, idValue, updateKey, valueUpdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class BasicController.
     */
    @Test
    public void testUpdate_Document_Document() {
        System.out.println("update");
        Document query = null;
        Document upload = null;
        BasicController instance = null;
        instance.update(query, upload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
