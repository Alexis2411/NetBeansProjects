package compraventa;

public class Cliente 
{
    private String nombre;
    private String id_cliente;
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public  String getnombre()
    {
        return nombre;
    }
    
    public void setid_cliente(String id_cliente)
    {
        this.id_cliente=id_cliente;
    }
    
    public String getid_cliente()
    {
        return id_cliente;
    }
}
