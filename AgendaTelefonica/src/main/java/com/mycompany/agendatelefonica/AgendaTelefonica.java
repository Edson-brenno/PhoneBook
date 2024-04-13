/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendatelefonica;
import com.mycompany.listaTelefonicaDuplamenteEncadeada.ListaTelefonicaDuplamenteEncadeada;
/**
 *
 * @author brenno
 */
public class AgendaTelefonica {

    public static void main(String[] args) throws Exception {
        ListaTelefonicaDuplamenteEncadeada agenda = new ListaTelefonicaDuplamenteEncadeada();
        
        agenda.adicionarNovoNumero(71, 996474837);
        agenda.adicionarNovoNumero(71, 123456789);
        agenda.adicionarNovoNumero(71, 223456789);
        agenda.adicionarNovoNumero(71, 323456789);
        
        agenda.removerNumero(71, 223456789);
        
        agenda.mostrarDados();
    }
}
