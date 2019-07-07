package dev.entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Livreur")
@Table(name = "livreur")
public class Livreur {

    @Id
    private Integer id;
    private String name;
    private String address;
    private String telNumber;
    
    
    
    public Livreur(Integer ID, String name, String address, String telNumber) {
        super();
        this.id=ID;
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelNumber() {
        return telNumber;
    }
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Livreur [name=");
        builder.append(name);
        builder.append(", address=");
        builder.append(address);
        builder.append(", telNumber=");
        builder.append(telNumber);
        builder.append("]");
        return builder.toString();
    }
    
    
}
