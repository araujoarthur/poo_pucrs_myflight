package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		this.empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea emp) {
        this.empresas.add(emp);
    }

    public ArrayList<CiaAerea> listarTodas() {
        return new ArrayList<CiaAerea>(this.empresas);
    }

    public CiaAerea buscarCodigo(String cod) {
		// TO-DO
    }

	public CiaAerea buscarNome(String nome) {
		// TO-DO
	}
}
