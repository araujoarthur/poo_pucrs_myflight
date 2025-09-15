package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.time.LocalDate;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
        this.voos = new ArrayList<>();
    }

    public void adicionar(Voo voo) {
        this.voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return new ArrayList<Voo>(this.voos);
    }

    public ArrayList<Voo> buscarData(LocalDate data) {
        ArrayList<Voo> res = new ArrayList<>();

        return res;
    }
}
