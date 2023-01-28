package com.msb.mediator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 15:27
 */
public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else if (person == tenant) {
            houseOwner.getMessage(message);
        }
    }
}
