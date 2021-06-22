/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.model;

/**
 *
 * @author junie
 */
public class Establishment {
    private long id;
    private String establishmentName;
    private long mobileNumber;
    private String email;
    private String password;
    private String ownerFullName;
    private boolean isVerified;
    private String dateRegistered;
    
    public Establishment(){}

    public Establishment(long id, String establishmentName, long mobileNumber, String email, String password, String ownerFullName, boolean isVerified, String dateRegistered) {
        this.id = id;
        this.establishmentName = establishmentName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
        this.ownerFullName = ownerFullName;
        this.isVerified = isVerified;
        this.dateRegistered = dateRegistered;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    
    
}
