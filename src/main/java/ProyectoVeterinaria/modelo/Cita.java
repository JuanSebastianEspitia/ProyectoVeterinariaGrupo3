/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class Cita {
    private LocalDate fecha;
    private String hora;
    private Mascota mascota;
    private Dueño dueño;

    public Cita(LocalDate fecha, String hora,  Mascota mascota, Dueño dueño) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.dueño = dueño;
    }

    

    public String getFecha() {
        return String.valueOf(fecha.getYear())+"/"+String.valueOf(fecha.getMonth())+"/"+String.valueOf(fecha.getDayOfMonth());
    }
    
    

    public String getHora() {
        return hora;
    }

    

    public Mascota getMascota() {
        return mascota;
    }

    public Dueño getDueño() {
        return dueño;
    }
    
    
    
}
