package main.java.com.pokemonbattle.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseService {

    public String guardarDato() {
        try {
            Firestore db = FirestoreClient.getFirestore();
            Map<String, Object> data = new HashMap<>();
            data.put("mensaje", "Conexion exitosa con Firestore");
            data.put("estado", "ok");
            db.collection("test")
                .document("doc1")
                .set(data);
            return "Datos guardados correctamente";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error al guardar datos: " + e.getMessage();
        }
    }
}
