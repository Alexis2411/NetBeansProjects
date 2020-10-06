package compraventa;

public class Venta 
{
    private String id_venta;
    private String fecha;
    private final Producto producto[];
    private Cliente cliente;
    private int i = 0;
    
    public Venta()
    {
        producto = new Producto[10];
    }
    
    public void setid_venta(String id_venta)
    {
        this.id_venta=id_venta;
    }
    
    public String getid_venta()
    {
        return id_venta;
    }
    
    public void setfecha(String fecha)
    {
        this.fecha=fecha;
    }
    
    public String getfecha()
    {
        return fecha;  
    }
    
    public void setproducto(Producto producto)
    {
        this.producto[getPos()] = producto;
        setPos(getPos() + 1);
    }
    
    public Producto[] getproducto()
    {
        return producto;
    }
    
    public void setcliente(Cliente cliente)
    {
        this.cliente=cliente;
    }
    
    public Cliente getcliente()
    {
        return cliente;
    }
    
    public int getPos()
    {
        return i;
    }
    
    private void setPos(int i)
    {
        this.i = i;
    }
}
