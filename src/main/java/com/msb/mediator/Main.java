package com.msb.mediator;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/28 15:40
 */
public class Main {

    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner(mediator, "张三");
        Tenant tenant = new Tenant(mediator, "李四");
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        houseOwner.contact("出租一套三室一厅的房子,租金6000,可谈!");
        tenant.contact("求租一套三室一厅的房子,租金在5000-6000之间!");
    }
}
