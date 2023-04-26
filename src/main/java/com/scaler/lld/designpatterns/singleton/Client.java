package com.scaler.lld.designpatterns.singleton;

import javax.xml.crypto.Data;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection dbc = DatabaseConnection.getInstance();

        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
    }
}
