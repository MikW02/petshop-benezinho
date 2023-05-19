package Model.Pessoas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PessoaFisica extends Pessoa{

    private String CPF;
    private Sexo sexo;

    private ArrayList<PessoaFisica> filhos = new ArrayList<PessoaFisica>();

    public PessoaFisica() {
    }


    public PessoaFisica(long id, String nome, String CPF, Sexo sexo) {
        super(id, nome);
        this.CPF = CPF;
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }



    public ArrayList<PessoaFisica> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<PessoaFisica> filhos) {
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", sexo=" + sexo +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}
