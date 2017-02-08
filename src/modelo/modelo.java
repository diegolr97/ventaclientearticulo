/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 *
 * @author Usuario
 */
public class modelo {
    
    MongoCollection<Document> clientes;
    MongoCollection<Document> articulos;
    MongoCollection<Document> ventas;
    
    public modelo(){
        MongoClient cliente = new MongoClient("localhost", 27017);
        MongoDatabase db = cliente.getDatabase("venta");
        clientes = db.getCollection("clientes");
        articulos = db.getCollection("articulos");
        ventas = db.getCollection("ventas");
    }
    
    public void insertarArticulo(){
        
    }
    
}
