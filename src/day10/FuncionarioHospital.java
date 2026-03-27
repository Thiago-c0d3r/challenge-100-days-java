package day10;

public class FuncionarioHospital {
    private String nome;
    private String cpf;
    private String matricula;
    private double salario;
    //construtor
    public FuncionarioHospital
            (
                    String nome,
                    String cpf,
                    String matricula,
                    double salario
            )
    {

        if(nome.equals("")){
            System.out.println("nome inválido!");
        }else{
            this.nome = nome;
        }

        if (cpf.length()<11){
            System.out.println("CPF inválido!");
        }else{
            this.cpf = cpf;
        }

        this.matricula = matricula;

        if (salario<0){
            System.out.println("Salário inválido!");
        }else{
            this.salario = salario;
        }

    }



    public void baterPonto(){
        System.out.println("[PONTO]" + nome + " (Matrícula: " + matricula + ") registrou entrada.");
    }

    public void exibirCracha() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("  HOSPITAL JAVA");
        System.out.println("  Nome: "      + nome);
        System.out.println("  CPF: "       + cpf);
        System.out.println("  Matrícula: " + matricula);
        System.out.println("╚══════════════════════════╝");
    }


    //getters para as subclasses;
    public String getNome()       { return nome; }
    public String getCpf()        { return cpf; }
    public String getMatricula()  { return matricula; }
    public double getSalario()    { return salario; }

}
