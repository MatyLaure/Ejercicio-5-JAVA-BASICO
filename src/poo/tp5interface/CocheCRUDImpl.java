package poo.tp5interface;

public class CocheCRUDImpl implements CocheCRUD {

    String lista = "Esta accion muestra una lista de datos";

    @Override
    public void save() {

        System.out.println("Esta accion guarda los datos que nosotros seleccionemos");

    }

    @Override
    public String findAll() {
        return lista;
    }

    @Override
    public void delete() {

        System.out.println("Esta accion borra los datos que nosotros querramos");

    }
}
