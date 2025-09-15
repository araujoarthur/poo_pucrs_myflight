package pucrs.myflight.modelo;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
        this.aeroportos = new ArrayList<>();
    }

    public ArrayList<Aeroporto> listarTodos() {
        return new ArrayList<Aeroporto>(this.aeroportos);
    }

    public ArrayList<Aeroporto> buscarPorCodigo(String cod) {
        ArrayList<Aeroporto> res = new ArrayList<>();

        // TO-DO

        return res;
    }
}
