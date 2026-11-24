/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoVeterinaria.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN SEBASTIAN
 */
public class ComprobantePago {
    private String idComprobante;
    private ConsultaMedica consulta;
    private float subtotalBase;
    private float recargos;
    private float descuentos;
    private float total;

    public ComprobantePago(String idComprobante, ConsultaMedica consulta, float subtotalBase, float recargos, float descuentos, float total) {
        this.idComprobante = idComprobante;
        this.consulta = consulta;
        this.subtotalBase = subtotalBase;
        this.recargos = recargos;
        this.descuentos = descuentos;
        this.total = total;
    }

    public String getIdComprobante() {
        return idComprobante;
    }

    public ConsultaMedica getConsulta() {
        return this.consulta;
    }

    public float getSubtotalBase() {
        return this.subtotalBase;
    }

    public float getRecargos() {
        return this.recargos;
    }

    public float getDescuentos() {
        return this.descuentos;
    }

    public float getTotal() {
        return this.total;
    }
    
    
    
    public void obtenerComprobante(){
        JOptionPane.showMessageDialog(null,  "COMPROBANTE DE PAGO \n"+
            this.getIdComprobante()+
            "\n -----------------------------------"+
            "\n MASCOTA: "+this.getConsulta().getCita().getMascota().getNombre()+
            "\n DUEÑO: "+this.getConsulta().getCita().getDueño().getNombre()+
            "\n CORREO: "+this.getConsulta().getCita().getDueño().getCorreo()+
            "\n TELEFONO: "+this.getConsulta().getCita().getDueño().getTelefono()+
            "\n DOCUMENTO: "+this.getConsulta().getCita().getDueño().getDocumento()+
            "\n -----------------------------------"+
            "\n COSTO BASE: $"+this.getSubtotalBase()+
            "\n RECARGO EXOTICA (25%): $"+this.getRecargos()+
            "\n VACUNAS: "+
            "\n "+this.getConsulta().obtenerVacunas()+
            "\n TOTAL VACUNAS: $"+this.getConsulta().calcularValorBiologico()+
            "\n SEDACIÓN: $"+this.getConsulta().obtenerCostoSedacion()+
            "\n DESCUENTO POR MAS DE DOS MASCOTAS (10%): $"+this.consulta.obtenerDescuento(this.getConsulta().obtenerTotalSinDescuentos())+
            "\n -----------------------------------"+
            "\n TOTAL: $"+this.getConsulta().obtenerTotalTotal());
    }
}



