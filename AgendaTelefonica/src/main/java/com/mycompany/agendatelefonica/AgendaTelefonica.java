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
        agenda.adicionarTelefoneNoFinal("t4", 71, 323456789);
        agenda.adicionarTelefoneNoFinal("t5", 71, 523456789);
        
        agenda.inverterLista();
        
        agenda.adicionarTelefoneNoInicio("ts", 71, 623456789);
        agenda.removerTelefone(71, 323456789);
        
        agenda.adicionarTelefoneNoMeio("tm", 71, 723456789);
        System.out.println("====================================");
        
        agenda.mostrarDados();
    }
}
