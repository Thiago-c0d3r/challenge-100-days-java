package day10;

public class Medico extends FuncionarioHospital{

    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, String matricula, double salario,
                  String crm, String especialidade) {

        // OBRIGATÓRIO: primeira linha do escopo do construtor da "sub"
        // com construtor da "super" para:
        // Construir a parte "FuncionarioHospital" desse objeto
        super(nome, cpf, matricula, salario);

        // Agora sim: atributos exclusivos do Médico(outra parte do objeto)
        this.crm          = crm;
        this.especialidade = especialidade;
    }


    public void prescreverMedicamento(String paciente, String medicamento) {
        System.out.println("[PRESCRIÇÃO] Dr(a). " + getNome() +
                " | Especialidade: " + especialidade);
        System.out.println("  Paciente: " + paciente);
        System.out.println("  Medicamento: " + medicamento);
        System.out.println("  CRM: " + crm);
    }
}
