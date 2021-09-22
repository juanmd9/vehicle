package com.teclogi.fase2.vehiculo.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.teclogi.fase2.vehiculo.model.Vehicle;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class VehicleService implements com.teclogi.fase2.vehiculo.service.VehicleService {

    private Gson gson = new GsonBuilder().create();

    /**
     * This method invoke an extern service to create a new vehicle
     * @param vehicle The information for the new vehicle.
     * @return The new vehicle in case of success.
     * @throws IOException
     */
    @Override
    public Vehicle createVehicle(Vehicle vehicle) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpPost httpPost = new HttpPost("https://test.teclogi.com/Teclogi/services/vehicle");
            StringEntity entity = new StringEntity(gson.toJson(vehicle), "UTF-8");
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "*/*");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("tokenUser", "E630C3F619EC42164D17FBA99731D8624D332936D43420845CC214E501D122B3");
            HttpResponse response = client.execute(httpPost);
            HttpEntity entity1 = response.getEntity();
            String responseString = EntityUtils.toString(entity1, "UTF-8");
            Vehicle vehicle1 = gson.fromJson(responseString, Vehicle.class);
            return vehicle1;
        } catch (IOException e){
            throw e;
        }
    }
}
