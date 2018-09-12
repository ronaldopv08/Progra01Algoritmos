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

public class UsuarioPedido {
	public int pCedula;
	public String PNombre;
	public String pDireccion;
	public String pCorreo;
	public int pTelefono;


	public UsuarioPedido(int pCedula,String pNombre, String pDireccion, String pCorreo,int pTelefono){
	    this.pTelefono= pTelefono;
	    this.pCedula=pCedula;
	    this.PNombre=pNombre;
	    this.pDireccion=pDireccion;
	    this.pCorreo=pCorreo;
       
    
	}
	
	public class Cola{
		UsuarioPedido Pedido;
		Cola siguiente;
		
		public Cola() {
			this.Pedido=null;
			this.siguiente=null;
		}
		public Cola (UsuarioPedido Pedido) {
			this.Pedido=Pedido;
			this.siguiente=null;
		}
	}
	
	public Cola head;
	public Cola tail;
	
	public int getpCedula() {
		return pCedula;
	}

	public String getPNombre() {
		return PNombre;
	}
	
	
	public String getpDireccion() {
		return pDireccion;
	}
	
	
	public String getpCorreo() {
		return pCorreo;
	}
	
	
	public int getpTelefono() {
		return pTelefono;
	}
	
