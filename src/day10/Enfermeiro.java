package day10;

public class Enfermeiro extends FuncionarioHospital{
    private String coren;
    private String unidade;//lugar onde trabalha

    public Enfermeiro ( String nome, String cpf, String matricula, double salario, String coren, String unidade ) {
        super(nome , cpf , matricula , salario);//usa construtor da super
        //agr sim pode criar construtor da filha abaixo:
        this.coren = coren;
        this.unidade = unidade;
    }

    public void realizarTriagem(String paciente, int nivelDor){
        String prioridade = nivelDor >= 8 ? "\uD83D\uDD34Emergência!" :
                nivelDor >= 5 ? "\uD83D\uDFE1Urgente!" : "\uD83D\uDFE2Normal";

        System.out.println("[TRIAGEM] Enf. " + getNome() +
                " | Unidade: " + unidade);
        System.out.println("  Paciente:   " + paciente);
        System.out.println("  Dor:        " + nivelDor + "/10");
        System.out.println("  Prioridade: " + prioridade);
    }
}
