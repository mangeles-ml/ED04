package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lista de contactos
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

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
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Borrar un contacto de la lista de contactos
     * @param name
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
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
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

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
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}