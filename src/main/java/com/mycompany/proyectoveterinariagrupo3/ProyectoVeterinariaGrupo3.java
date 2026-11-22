/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoveterinariagrupo3;

import ProyectoVeterinaria.controlador.Controlador;
import ProyectoVeterinaria.modelo.Registro;
import ProyectoVeterinaria.vista.VistaVeterinaria;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ProyectoVeterinariaGrupo3 {

    public static void main(String[] args) {
        VistaVeterinaria vistaVeterinaria=new VistaVeterinaria();
       
       Registro registro=new Registro();
       Controlador controlador=new Controlador(vistaVeterinaria,registro);
       controlador.iniciar();
       vistaVeterinaria.setVisible(true);
       
    }
}
