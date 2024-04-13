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
        
        agenda.adicionarTelefone("t1", 71, 996474837);
        agenda.adicionarTelefone("t2", 71, 123456789);
        agenda.adicionarTelefone("t3", 71, 223456789);
        agenda.adicionarTelefone("t4", 71, 323456789);
        agenda.adicionarTelefoneNoInicio("t5", 71, 423456789);
        
        //agenda.removerTelefone(71, 223456789);
        
        agenda.mostrarDados();
    }
}
