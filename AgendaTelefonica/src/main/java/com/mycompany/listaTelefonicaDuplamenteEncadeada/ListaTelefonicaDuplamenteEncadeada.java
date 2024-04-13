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
    public void adicionarNovoNumero(int dddNumero, int numeroTelefone){
        
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
            // Adiciona novo numero no proximo nó
            noAtual.proximoNo = new NoLista(numeroTelefone, dddNumero);
            // Seta no anterior do proximo nó
            noAtual.proximoNo.noAnterior = noAtual;
            
        }
    }
    
    // Metodo para remocao de um numero

    /**
     *
     * @param dddNumero
     * @param numeroTelefone
     * @throws Exception
     */
    public void removerNumero(int dddNumero, int numeroTelefone) 
            throws Exception{
        
        if(this.inicio == null){
            throw new Exception("Lista Vazia");
        }
        else{
            
            if(this.inicio.dddNumero != dddNumero || 
                    this.inicio.numeroTelefone != numeroTelefone){
                
                // No atual
                NoLista noAtual = this.inicio;

                // equanto o proximo nó for diferente de nulo
                while(noAtual.proximoNo != null){
                    noAtual = noAtual.proximoNo;
                    
                    if (noAtual.dddNumero == dddNumero && 
                            noAtual.numeroTelefone == numeroTelefone){
                        
                        break;
                    }
                }
                // Seta no anterior do proximo nó
                noAtual.proximoNo.noAnterior = noAtual.noAnterior;
                
                // Adiciona novo numero no proximo nó
                noAtual = noAtual.proximoNo;
                
            }else{
                
                this.inicio = this.inicio.proximoNo;
                this.inicio.noAnterior = null;
                
            }
            
        }
    }
   
}
