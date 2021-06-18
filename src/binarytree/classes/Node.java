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
public class Node {
    private int dado;
    
    private Node left = null;
    private Node right = null;
    
    
    public Node(int dado){
        this.dado = dado;
    }
    
    protected boolean add(int novoDado){
        try{
            System.out.println("aqui");
            if(novoDado < this.dado){
                System.out.println("2");
                if(this.left != null){
                    return this.left.add(novoDado);
                }else{
                    this.left = new Node(novoDado);
                    return true;
                }
            }else if(novoDado > this.dado){
                System.out.println("3");
                if(this.right != null){
                    return this.right.add(novoDado);
                }else{
                    this.right = new Node(novoDado);
                    return true;
                }
            }
        }catch(Exception error){
            System.out.println(error);
            return false;
        };
        return false;
    }
    
    protected void print(){
        if(this.left != null){
            this.left.print();
        }
        System.out.println(this.dado);
        if(this.right != null){
            this.right.print();
        }
    }
    
    protected void buscaProfundidade(int dado){
       if(this.dado == dado){
           System.out.println("Dado " + dado + " encontrado na árvore!");
       }
       if(dado < this.dado){
            if( this.left != null){
                this.left.buscaProfundidade(dado);
            }else System.out.println("Dado inexistente na árvore!");     
            
        }else if(dado > this.dado){
             if(this.right != null){
                 this.right.buscaProfundidade(dado);
             }else System.out.println("Dado inexistente na árvore!");
         }
    }

}
