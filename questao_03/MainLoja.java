package questao_03;

/*
Crie uma hierarquia de herança com 3 níveis:
Pessoa, Funcionário e (Vendedor + Gerente)
• Coloque os dados pessoais na classe Pessoa
• Coloque os dados comuns a todos os funcionários na classe Funcionario
• Coloque os dados exclusivos do Gerente na sua classe. O salário do gerente é baseado nas vendas dos vendedores
• Cada Vendedor deve ter um Gerente responsável
• O salário do Vendedor deverá ser por comissão
 */
public class MainLoja {
    public static void main(String[] args) {
/*
        Pessoa objP01 = new Pessoa();
        objP01.setNome("Joao");
        objP01.setCpf("000.222.555-40");
        objP01.setIdade(20);
        objP01.setTelefone("49 8800-5500");

        Funcionario objFunc01 = new Funcionario();
        objFunc01.setNomeCargo("Caixa");
        objFunc01.setSetor("Financeiro");
        objFunc01.setSalario(1000);
        objFunc01.setNome("Maria");

        System.out.println("Nome: " + objFunc01.getNome());
        System.out.println("Cargo: " + objFunc01.getNomeCargo());
*/

        Gerente objGer01 = new Gerente("Comercial");
        objGer01.setNome("Marcos");
        objGer01.setSetor("Gestão Comercial");
        objGer01.setNomeCargo("Gerente " + objGer01.getTipo());


        Vendedor objV01 = new Vendedor();
        objV01.setNome("Jose");
        objV01.setIdade(25);
        objV01.setSetor("Vendas");
        objV01.setNomeCargo("Atendente");

        double valorVendaMesV01 = (1200 * 0.05) * 25;
        objV01.setSalario(valorVendaMesV01); //comissao de 5% sobre uma venda, fez 25 vendas no valor de 1200. (1200 * 0,05) * 25 = R$1.500,00
        objV01.setGerente(objGer01); // add o objGerente ao vendedor

        Vendedor objV02 = new Vendedor();
        objV02.setNome("Jose");
        objV02.setIdade(25);
        objV02.setSetor("Vendas");
        objV02.setNomeCargo("Atendente");

        double valorVendaMesV02 = (1200 * 0.05) * 23;
        objV02.setSalario(valorVendaMesV02); //comissao de 5% sobre uma venda, fez 23 vendas no valor de 1200. (1200 * 0,05) * 23 = R$1.380,00
        objV02.setGerente(objGer01); // add o objGerente ao vendedor

        double valorVendaMesGerente = (1200 * 0.05) * (23 + 25);
        objGer01.setSalario(valorVendaMesGerente);

        System.out.println("#### Vendedores #### ");
        System.out.println("Nome: " + objV01.getNome() + " Setor: " + objV01.getSetor());
        System.out.println("Cargo: " + objV01.getNomeCargo());
        System.out.println("Salario: " + objV01.getSalario());

        System.out.println("Nome: " + objV02.getNome() + " Setor: " + objV02.getSetor());
        System.out.println("Cargo: " + objV02.getNomeCargo());
        System.out.println("Salario: " + objV02.getSalario());

        System.out.println("#### Gerente #### ");
        System.out.println("Nome: " + objGer01.getNome() + " Setor: " + objGer01.getSetor());
        System.out.println("Cargo: " + objGer01.getNomeCargo());
        System.out.println("Salario: " + objGer01.getSalario());


    }
}
