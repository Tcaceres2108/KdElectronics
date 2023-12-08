
package kdelectronics;

public class producto {
    private int idproducto;
    private String nombreproducto;
    private String descripcion;
    private double preciobase;
    private double precioventa;
    private String categoria;
    private int cantidaddisponible;

    public producto(int idproducto, String nombreproducto, String descripcion, double preciobase, double precioventa, String categoria, int cantidaddisponible) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.descripcion = descripcion;
        this.preciobase = preciobase;
        this.precioventa = precioventa;
        this.categoria = categoria;
        this.cantidaddisponible = cantidaddisponible;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidaddisponible() {
        return cantidaddisponible;
    }

    public void setCantidaddisponible(int cantidaddisponible) {
        this.cantidaddisponible = cantidaddisponible;
    }
    
    
    
}
