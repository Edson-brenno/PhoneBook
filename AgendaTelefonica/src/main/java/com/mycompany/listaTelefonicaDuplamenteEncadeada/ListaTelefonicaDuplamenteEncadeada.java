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
     * @return 
     */
    // retorna o tamanho da lista
    public int tamanhoLista(){
        int contador = 0;
        
        // Se a lista está vazia
        if (this.inicio == null){
            return contador;
        }else{
            
            NoLista noAtual = this.inicio;
        
            while(noAtual.proximoNo != null){
                contador++;
                noAtual = noAtual.proximoNo;
            }
            
            return contador + 1;
        }        
    }
    
    /**
     * 
     * @param nomeContato
     * @param dddNumero
     * @param numeroTelefone
     */
    // Adiciona novo contato no inicio da lista
    public void adicionarTelefoneNoInicio(String nomeContato, int dddNumero, 
            int numeroTelefone){
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
    
    /**
     *
     * @param nomeContato
     * @param dddNumero
     * @param numeroTelefone
     */
    // Adiciona um novo contato no meio da lista
    public void adicionarTelefoneNoMeio(String nomeContato, int dddNumero, 
            int numeroTelefone){
        // Se a lista ainda não foi inciada
        if (this.inicio == null){
            
            this.adicionarTelefoneNoInicio(nomeContato, dddNumero, 
                    numeroTelefone);
            
        }
        // Se a lista possui apenas um contato
        else if(this.inicio.proximoNo == null){ 
            this.adicionarTelefoneNoFinal(nomeContato, dddNumero, 
                    numeroTelefone);
        }else{
             // posicao do meio da lista
            int meioDaLista = (this.tamanhoLista() % 2 == 0) ? 
                    this.tamanhoLista() / 2: (this.tamanhoLista() - 1) / 2;

            // No atual
            NoLista noAtual = this.inicio;

            for(int c = 1; c < meioDaLista;c++){
                noAtual = noAtual.proximoNo;
            }

            // Estancia no novo
            NoLista noNovo = new NoLista(numeroTelefone, dddNumero, 
                    nomeContato);
            // move o proximo do no atual para o nó novo
            noNovo.proximoNo = noAtual.proximoNo;
            // atualiza o no anterior do proximo nó
            noNovo.proximoNo.noAnterior = noNovo;
            // nó anterior é igual ao atual
            noNovo.noAnterior = noAtual;

            noAtual.proximoNo = noNovo;
        }
      
    }
    
    // Método para adicionar um novo numero
    public void adicionarTelefoneNoFinal(String nomeContato, int dddNumero, 
            int numeroTelefone){
        
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
            noAtual.proximoNo = new NoLista(numeroTelefone, dddNumero, 
                    nomeContato);
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
    
    /**
     *
     * @throws Exception
     */
    // Inverte a lista de contatos
    public void inverterLista() throws Exception{
        if(this.inicio == null){
            throw new Exception("A lista esta vazia");
        }
        else{
            NoLista noAtual = this.inicio;
            NoLista noInvertido, listaInvertida;
            
            // while para chegar na ultima posicao
            while(noAtual.proximoNo != null){
                noAtual = noAtual.proximoNo;
            }
            
            // lista invertida
            listaInvertida = new NoLista(noAtual.numeroTelefone, noAtual.dddNumero,
            noAtual.nomeContato);
            
            // nó para inverter a lista
            noInvertido = listaInvertida;
            
            // voltando o nó autal
            while(noAtual.noAnterior != null){
                noAtual = noAtual.noAnterior;
                
                // atualizando o no invertido
                while(noInvertido.proximoNo != null){
                    noInvertido = noInvertido.proximoNo;
                    
                }
                // atribuindo valores ao nó invertido
                noInvertido.proximoNo = new NoLista(noAtual.numeroTelefone,
                noAtual.dddNumero,noAtual.nomeContato);
                noInvertido.proximoNo.noAnterior = noInvertido;
            }
            
            // atualiza inicio pela lista invertida
            this.inicio = listaInvertida;
        }
    }
    
    public void mostrarDados(){
        NoLista atual = this.inicio;
        
        System.out.println("Nome: " + atual.nomeContato + " (" + atual.dddNumero
                + ") " + atual.numeroTelefone);
        
        while(atual.proximoNo != null){
            atual = atual.proximoNo;
            System.out.println("Nome: " + atual.nomeContato + " (" 
                    + atual.dddNumero + ") " + atual.numeroTelefone);
        }
    }
   
}
