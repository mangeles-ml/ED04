package org.example;

import java.util.ArrayList;
import java.util.List;

public class InfoContacto {
    private String name;
    private List<String> phones;
    public InfoContacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
    /**
     * Obtener el nombre del contacto
     *
     * @return Nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtener los teléfonos asociados al contacto
     *
     * @return Teléfonos asociados al contacto
     */
    public List<String> getPhones() {
        return this.phones;
    }
}

