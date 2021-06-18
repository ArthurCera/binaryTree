/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree.classes;

/**
 *
 * @author User
 */
public class Tree {
    private Node node = null;
    
    
    public Tree(int dado){
        this.node = new Node(dado);
    }
    
    public Tree(){
        
    }
    
    public void print(){
        if(this.node == null){
            System.out.println("Árvore vazia!\n");
        }else this.node.print();
    }
    
    public boolean add(int dado){
        if(this.node == null){
            this.node = new Node(dado);
            return true;
        }else return this.node.add(dado);
    }
    
    public void buscaProfundidade(int dado){
        if(this.node == null){
            System.out.println("Árvore vazia!");
        }else{
            this.node.buscaProfundidade(dado);
        }
    }
}
