/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nolista;

/**
 *
 * @author brenno
 */
public class NoLista {
    // atributos para o numero do Telefone e o ddd do numero
    public int numeroTelefone, dddNumero;
    // atibutos para acesso aos proximos e anteriores nós
    public NoLista noAnterior, proximoNo;
    
    // Método construtor
    public NoLista(int numeroTelefone, int dddNumero){
        // Atribui valores aos atributos do numero de telefone e ddd
        this.numeroTelefone = numeroTelefone;
        this.dddNumero = dddNumero;
        // Seta os nós como nulos
        this.noAnterior = null;
        this.proximoNo = null;
    }
}
