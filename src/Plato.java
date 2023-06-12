public class Plato{ //implements Comparable<Plato>{
    private String nombre;
    private double precio;
    private double valorCalórico;
    private int tiempoDePreparación;

    public Plato(String nombre, double precio, double valorCalórico, int tiempoDePreparación) {
        this.nombre = nombre;
        this.precio = precio;
        this.valorCalórico = valorCalórico;
        this.tiempoDePreparación = tiempoDePreparación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValorCalórico() {
        return valorCalórico;
    }

    public void setValorCalórico(double valorCalórico) {
        this.valorCalórico = valorCalórico;
    }

    public int getTiempoDePreparación() {
        return tiempoDePreparación;
    }

    public void setTiempoDePreparación(int tiempoDePreparación) {
        this.tiempoDePreparación = tiempoDePreparación;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", valorCalórico=" + valorCalórico +
                ", tiempoDePreparación=" + tiempoDePreparación +
                '}';
    }

    /*@Override
    public int compareTo(Plato p) {
        return Integer.compare(Integer.parseInt(this.nombre),Integer.parseInt(p.nombre));
    }*/
}
