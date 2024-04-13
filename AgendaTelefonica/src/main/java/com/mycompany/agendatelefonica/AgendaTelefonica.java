/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendatelefonica;
import com.mycompany.listaTelefonicaDuplamenteEncadeada.ListaTelefonicaDuplamenteEncadeada;
/**
 *
 * @author Edson Brenno Ribeiro de Santana
 */
public class AgendaTelefonica {

    public static void main(String[] args) throws Exception {
        ListaTelefonicaDuplamenteEncadeada agenda = new ListaTelefonicaDuplamenteEncadeada();
        
        agenda.adicionarTelefoneNoFinal("t1", 71, 996474837);
        agenda.adicionarTelefoneNoFinal("t2", 71, 123456789);
        agenda.adicionarTelefoneNoFinal("t3", 71, 223456789);
        //agenda.adicionarTelefoneNoFinal("t4", 71, 323456789);
        //agenda.adicionarTelefoneNoFinal("t4", 71, 523456789);
        //agenda.adicionarTelefoneNoInicio("t5", 71, 423456789);
        
        //agenda.removerTelefone(71, 223456789);
        agenda.adicionarTelefoneNoMeio("meio", 71, 623456789);
        //System.out.println(agenda.add);
        agenda.mostrarDados();
    }
}
