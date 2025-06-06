package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lista de contactos
 */
public class Agenda implements OperacionesAgenda {
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Constructor de la lista de contactos
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añadir un contacto a la lista de contactos
     * @param name
     * @param phone
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getInformacionContacto().getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getInformacionContacto().getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Borrar un contacto de la lista de contactos
     * @param name
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getInformacionContacto().getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica el número de teléfono de un contacto
     * @param name nombre del contacto
     * @param oldPhone teléfono antiguo del contacto que hay que modificar
     * @param newPhone teléfono nuevo
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getInformacionContacto().getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getInformacionContacto().getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtener todos los contactos de la lista de contactos
     * @return los contactos de la lista de contactos
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}