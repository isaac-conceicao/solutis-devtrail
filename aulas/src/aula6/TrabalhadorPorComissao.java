package aula6;

public class TrabalhadorPorComissao extends Trabalhador implements SeguroSaude{

    private double salarioBase;
    private String matriculaPlano;
    private int qtdeDependentes;
    public TrabalhadorPorComissao(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    @Override
    public double gerarSalario() {
        return this.salarioBase;
    }

    @Override
    public String getMatriculaPlano() {
        return this.matriculaPlano;
    }

    @Override
    public int getQtdeDependentes() {
        return this.qtdeDependentes;
    }

    @Override
    public String getNomeCompletoTitular() {
        return super.getNome()+" "+super.getSobrenome();
    }
}
