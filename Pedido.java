/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

/**
 *
 * @author Kenneth
 */
public class Pedido {
    public String Libro1;
    public String Libro2;
    public String Libro3;
    public int Cantidad1;
    public int Cantidad2;
    public int Cantidad3;
    public String Fecha;
    public String Status;
    public int Cedula;
    
    
    public Pedido(String libro1, String libro2, String libro3, int pCantidad1, int pCantidad2, int pCantidad3, String Fecha, int kCedula){
        this.Libro1=libro1;
        this.Libro2=libro2;
        this.Libro3=libro3;
        this.Cantidad1=pCantidad1;
        this.Cantidad2=pCantidad2;
        this.Cantidad3=pCantidad3;
        this.Status=("No Enviado");
        this.Fecha=Fecha;
        this.Cedula=kCedula;
                }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
