import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menu {
    private List<Plato> listaPlatos;
    private Plato p;

    public Menu() {
        this.listaPlatos = new ArrayList<>();
    }

    public List<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public boolean agregarPlato(Plato p) {
        if (buscarNombre(p.getNombre()) == null) {
            listaPlatos.add(p);
            return true;
        } else {
            return false;
        }
    }

    public Plato buscarNombre(String nombre) {
        for (Plato p : listaPlatos) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public boolean modificar(String nombre, double precio, double valorCalórico,int tiempoDePreparación){
        Plato p=buscarNombre(nombre);
        if(p!=null){
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setValorCalórico(valorCalórico);
            p.setTiempoDePreparación(tiempoDePreparación);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(String nombre){
        Plato p=buscarNombre(nombre);
        if(p!=null){
            listaPlatos.remove(p);
            return true;
        } else {
            return false;
        }
    }



    public void QuemarDatos(){
        listaPlatos.add(new Plato("Plato1",12,10,5));
        listaPlatos.add(new Plato("Plato2",25,15,2));
        listaPlatos.add(new Plato("Plato3",14,12,10));
        listaPlatos.add(new Plato("Plato4",13,1,8));
        listaPlatos.add(new Plato("Plato5",16,19,22));

    }

    @Override
    public String toString() {
        return "Menu{" +
                "listaPlatos=" + listaPlatos +
                '}';
    }
}
