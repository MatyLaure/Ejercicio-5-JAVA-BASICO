import poo.tp5interface.CocheCRUD;
import poo.tp5interface.CocheCRUDImpl;

public class Main {


    public static void main(String[] args) {

        CocheCRUD cochecrud = new CocheCRUDImpl();

        cochecrud.save();
        cochecrud.findAll();
        cochecrud.delete();
    }
}