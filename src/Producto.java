public abstract class Producto implements IProducto, IMercaderia{
    private String nombre;
    private int stock;

    public Producto() {
    }

    public abstract void verificarExistencia();
    public abstract void obtenerTipoProducto();

    @Override
    public boolean ingresar() {
        return false;
    }

    @Override
    public boolean darDeBaja() {
        return false;
    }
}
