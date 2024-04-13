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
    
    /**
     * 
     * @param dddNumero
     * @param numeroTelefone
     */
    public void adicionarTelefoneNoInicio(String nomeContato,int dddNumero, int numeroTelefone){
        // Varifica se a lista já foi iniciada
        if (this.inicio == null){
            this.inicio = new NoLista(numeroTelefone, dddNumero, nomeContato);
        }
        else{
            NoLista noInicioAtual = this.inicio;
            this.inicio = new NoLista(numeroTelefone, dddNumero, nomeContato);
            this.inicio.proximoNo = noInicioAtual;
            this.inicio.proximoNo.noAnterior = this.inicio;
        }
    }
    
    // Método para adicionar um novo numero
    public void adicionarTelefone(String nomeContato, int dddNumero, int numeroTelefone){
        
        // Verifica se a lista já foi iniciada
        if (this.inicio == null){
            this.inicio = new NoLista(numeroTelefone, dddNumero, nomeContato);
        }else{
            // No atual
            NoLista noAtual = this.inicio;
            
            // equanto o proximo nó for diferente de nulo
            while(noAtual.proximoNo != null){
                noAtual = noAtual.proximoNo;
            }
            // Adiciona novo numero no proximo nó
            noAtual.proximoNo = new NoLista(numeroTelefone, dddNumero, nomeContato);
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
    public void removerTelefone(int dddNumero, int numeroTelefone) 
            throws Exception{
        // Se a lista não foi iniciada
        if(this.inicio == null){
            throw new Exception("Lista Vazia");
        }
        else{
            // Se o numero e o ddd do inicio da lista não for igual ao numero e ddd a remover
            if(this.inicio.dddNumero != dddNumero || 
                    this.inicio.numeroTelefone != numeroTelefone){
                
                // No atual
                NoLista noAtual = this.inicio;

                // equanto o proximo nó for diferente de nulo
                while(noAtual.proximoNo != null){
                    
                    noAtual = noAtual.proximoNo;
                    
                    // para while se achar o numero e ddd desejado
                    if (noAtual.dddNumero == dddNumero && 
                            noAtual.numeroTelefone == numeroTelefone){
                        
                        break;
                    }
                }
                
                // Se o numero a ser removido é o ultimo da lista
                if (noAtual.proximoNo == null){
                    noAtual = noAtual.noAnterior;
                    noAtual.proximoNo = null;
                }else{
             
                    // Remove dado desejado da lista
                    
                    noAtual.noAnterior.proximoNo = noAtual.proximoNo;
                    noAtual.proximoNo.noAnterior = noAtual.noAnterior;
                    noAtual = noAtual.proximoNo;
                }
                
                
            }else{
                // Remove dados desejado se tal estiver no inicio
                this.inicio = this.inicio.proximoNo;
                this.inicio.noAnterior = null;
                
            }
            
        }
    }
    
    public void mostrarDados(){
        NoLista atual = this.inicio;
        
        System.out.println("Nome: " + atual.nomeContato + " (" + atual.dddNumero + ") " + atual.numeroTelefone);
        
        while(atual.proximoNo != null){
            atual = atual.proximoNo;
            System.out.println("Nome: " + atual.nomeContato + " (" + atual.dddNumero + ") " + atual.numeroTelefone);
        }
    }
   
}
