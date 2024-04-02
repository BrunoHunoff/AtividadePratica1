public class FolhaPagamento {
    private String nomeFuncionario;
    private int horasTrab;
    private float valorHora;

    // GETTERS E SETTERS

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nome) {
        this.nomeFuncionario = nome;
    }
    public int getHorasTrab() {
        return horasTrab;
    }
    public void setHorasTrab(int horasTrab) {
        if (horasTrab < 0) {
            System.out.println("VALOR INVALIDO");
            this.horasTrab = 0;
            return;
        }
        this.horasTrab = horasTrab;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        if (valorHora < 0) {
            System.out.println("VALOR INVALIDO");
            this.valorHora = 0;
            return;
        }
        this.valorHora = valorHora;
    }

    // CONSTRUCTORS

    public FolhaPagamento(String nome, int horasTrab, float valorHora) {
        this.nomeFuncionario = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }

    public FolhaPagamento() {}

    // METODOS

    public float salarioBruto() {
        return horasTrab * valorHora;
    }        

    public float ir() {
        if (salarioBruto() > 1372.81) {

            if (salarioBruto() > 2743.25) {
                return (salarioBruto()*.275f);
            }

            return (salarioBruto()*.15f);
        }

        return 0.0f;
    }

    public float inss() {
        if (salarioBruto() > 868.29) {

            if (salarioBruto() > 1447.14) {
                
                if (salarioBruto() > 2894.27) {
                    return 318.37f;
                }

                return salarioBruto() * .11f;
            }

            return salarioBruto() * .09f;
        }

        return salarioBruto()*.08f;
    }

    public float fgts() {
        return salarioBruto() * .08f;
    }

    public float salarioLiquido() {
        return salarioBruto() - inss() - ir();
    }

    @Override
    public String toString() {
        return "\nFolha de pagamento:\n" + 
        "\nNome: " + nomeFuncionario +
        "\nHoras trabalhadas: " + horasTrab +
        "\nValor por hora: R$" + valorHora +
        "\n\nSalario bruto: R$" + salarioBruto() +
        "\nIR: R$" + ir() +
        "\nINSS: R$" + inss() +
        "\nFGTS: R$" + fgts() +
        "\nSalario Liquido: R$" + salarioLiquido()
        ;
    }
}
