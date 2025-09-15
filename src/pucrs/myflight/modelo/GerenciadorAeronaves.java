package pucrs.myflight.modelo;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves() {
        this.aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aeronave) {
        this.aeronaves.add(aeronave);
    }

    public ArrayList<Aeronave> listarTodas() {
        return new ArrayList<Aeronave>(this.aeronaves);
    }

    public Aeronave buscarPorCodigo(String cod) {
        // TO-DO
    }
}
