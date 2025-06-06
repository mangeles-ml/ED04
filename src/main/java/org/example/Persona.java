package org.example;

/**
 * Clase que representa la información de contacto de una persona (nombre y teléfonos)
 */
public class Persona {
    private InfoContacto infoContacto;

    /**
     * Constructor de un contacto
     *
     * @param name  Nombre del contacto
     * @param phone Teléfono del contacto
     */
    public Persona(String name, String phone) {
        this.infoContacto = new InfoContacto(name, phone);
    }

    public InfoContacto getInformacionContacto() {
        return infoContacto;
    }
}