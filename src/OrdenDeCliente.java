/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *clase para representar las ordenes de un cliente
 * @author ACR
 */
public class OrdenDeCliente {
 private String nombreCliente;
 private int numeroProductos;

    public OrdenDeCliente(String nombreCliente, int numeroProductos) {
        this.nombreCliente = nombreCliente;
        this.numeroProductos = numeroProductos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setNumeroProductos(int numeroProductos) {
        this.numeroProductos = numeroProductos;
    }
 
}
