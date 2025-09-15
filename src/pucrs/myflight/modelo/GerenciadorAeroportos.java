package pucrs.myflight.modelo;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
        this.aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto) {
        this.aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return new ArrayList<Aeroporto>(this.aeroportos);
    }

    public Aeroporto buscarPorCodigo(String cod) {
        // TO-DO
    }
}
