package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa la información de contacto de una persona (nombre y teléfonos)
 */
class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor de un contacto
     * @param name Nombre del contacto
     * @param phone Teléfono del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtener el nombre del contacto
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtener los teléfonos asociados al contacto
     * @return Teléfonos asociados al contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}