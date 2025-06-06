package org.example;

public interface OperacionesAgenda {
    void addContact(String name, String phone);
    void removeContact(String name);
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);
}
