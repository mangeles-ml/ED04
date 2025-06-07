package org.example;

import java.util.List;

public interface IntAgenda extends OperacionesAgenda {
    @Override
    void addContact(String name, String phone);

    @Override
    void removeContact(String name);

    @Override
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    List<Persona> getContacts();
}
