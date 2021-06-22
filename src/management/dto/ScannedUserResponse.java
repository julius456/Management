/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.dto;

import management.model.Establishment;
import management.model.User;

/**
 *
 * @author junie
 */
public class ScannedUserResponse {
    private long id;
    private User user;
    private double temperature;
    private Establishment scanByWhatEstablihsment;
    private String dateScanned;
    
    public ScannedUserResponse(){}

    public ScannedUserResponse(long id, User user, double temperature, Establishment scanByWhatEstablihsment, String dateScanned) {
        this.id = id;
        this.user = user;
        this.temperature = temperature;
        this.scanByWhatEstablihsment = scanByWhatEstablihsment;
        this.dateScanned = dateScanned;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Establishment getScanByWhatEstablihsment() {
        return scanByWhatEstablihsment;
    }

    public void setScanByWhatEstablihsment(Establishment scanByWhatEstablihsment) {
        this.scanByWhatEstablihsment = scanByWhatEstablihsment;
    }

    public String getDateScanned() {
        return dateScanned;
    }

    public void setDateScanned(String dateScanned) {
        this.dateScanned = dateScanned;
    }
    
    
}
