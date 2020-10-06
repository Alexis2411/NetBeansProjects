/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa;

/**
 *
 * @author ProDep-1
 */
public class CProducto {
    private Producto Aproducto[];
    private int i=0;
    
    public CProducto()
    {
        Aproducto=new Producto[100];
    }
    
    public void Añadir(Producto producto)
    {
        Aproducto[getPosicion()]=producto;
        setPosicion(getPosicion() + 1);
    }
    
       
    public Producto Buscar(String id_codigo)
    {   Producto aux=new Producto();
        
        for (int i = 0; i < getPosicion(); i++)
                if (id_codigo.compareTo(Aproducto[i].getid_codigo())==0)
                {   
                    aux.setid_codigo(Aproducto[i].getid_codigo());
                    aux.setdescripcion(Aproducto[i].getdescripcion());
                    aux.setexistencia(Aproducto[i].getexistencia());
                    aux.setprecio(Aproducto[i].getprecio());
                    
                    break;
                }
        return aux;      
    }
      
    private void setPosicion(int i)
    {
        this.i = i;
    }
    
    public int getPosicion()
    {
        return i;
    }
    
    public Producto[] getCatalogoProducto()
    {
        return Aproducto;
    }
}
