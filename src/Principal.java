public class Principal {
    public static void main(String[] args) throws Exception {

        FolhaPagamento f1 = new FolhaPagamento();

        System.out.println("Cadastrar folha de pagamento: \n");
        System.out.print("Nome do funcionario: ");
        f1.setNomeFuncionario(Console.lerString());
        System.out.print("Horas trabalhadas: ");
        f1.setHorasTrab(Console.lerInt());
        System.out.print("Valor por hora: ");
        f1.setValorHora(Console.lerFloat());

        System.out.println(f1);
    }
}
