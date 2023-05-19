package Model.Pessoas;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;

    private ArrayList<PessoaFisica> Socios = new ArrayList<PessoaFisica>();

    public PessoaJuridica() {

    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ArrayList<PessoaFisica> getSocios() {
        return Socios;
    }

    public void setSocios(ArrayList<PessoaFisica> socios) {
        Socios = socios;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", Socios=" + Socios +
                "} " + super.toString();
    }
}
