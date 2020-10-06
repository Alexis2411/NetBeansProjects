package compraventa;

class Producto 
{
    private String id_codigo;
    private String descripcion;
    private int existencia;
    private Double precio;
    
    public void setid_codigo(String id_codigo)
    {
        this.id_codigo=id_codigo;
    }
    
    public String getid_codigo()
    {
        return id_codigo;
    }
    
    public void setdescripcion(String descripcion)
    {
        this.descripcion=descripcion;
    }
    
    public String getdescripcion()
    {
        return descripcion;
    }
    
    public void setexistencia(int existencia)
    {
        this.existencia=existencia;
        
    }
    
    public int getexistencia()
    {
        return existencia;
    }
    
    public void setprecio(Double precio)
    {
        this.precio=precio;
    }
    
    public Double getprecio()
    {
        return precio;
    }
}

