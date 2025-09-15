package pucrs.myflight.modelo;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
        this.rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota) {
        this.rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return new ArrayList<Rota>(this.rotas);
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem) {
        ArrayList<Rota> res = new ArrayList<>();

        // TO-DO

        return res;
    }
}
