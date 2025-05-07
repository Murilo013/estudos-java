package Candidatura;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        System.out.println("Processo Seletivo");
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","ANA","MARCIA","JULIA","JOSÉ","ALEX","FABRICIO","MIRELA","VITOR","GUSTAVO"};
        int salarioBase = 2000;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while(candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido + " de salário");

            if (salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextInt(1800,2100);
    }

    static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioPretendido < salarioBase){
            System.out.println("Ligar para candidato");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Oferecer proposta");
        }
        else {
            System.out.println("Aguardando candidaturas");
        }

    }
}
