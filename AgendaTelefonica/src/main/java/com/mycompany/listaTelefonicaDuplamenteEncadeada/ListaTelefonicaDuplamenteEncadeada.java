/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaTelefonicaDuplamenteEncadeada;

// Importa no lista
import com.mycompany.nolista.NoLista;
/**
 *
 * @author brenno
 */
public class ListaTelefonicaDuplamenteEncadeada {
    
    public NoLista inicio;
    
    public ListaTelefonicaDuplamenteEncadeada(){
        this.inicio = null;
    }
    
    // Método para adicionar um novo numero
    public void adicionarNovoNumero(int numeroTelefone, int dddNumero){
        
        // Verifica se a lista já foi iniciada
        if (this.inicio == null){
            this.inicio = new NoLista(numeroTelefone, dddNumero);
        }else{
            // No atual
            NoLista noAtual = this.inicio;
            
            // equanto o proximo nó for diferente de nulo
            while(noAtual.proximoNo != null){
                noAtual = noAtual.proximoNo;
            }
            
            noAtual.proximoNo = new NoLista(numeroTelefone, dddNumero);
            
        }
    }
   
}
