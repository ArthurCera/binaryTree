/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import binarytree.classes.Tree;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree arv = new Tree();
        
        String entrada = "";
        
        while(!entrada.equals("e")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Para imprimir a arvore digite 'i'\nPara adicionar um valor (inteiros) digite a;"
                    + "\nPara buscar um valor digite 'b';"
                    + "\nPara sair do programa digite 'e';\n");
            
            String temp = sc.nextLine();
            if(temp.equals("e")) entrada = "e";
            if(temp.equals("a")){
                System.out.println("Digite o número inteiro que deseja adicionar a árvore : \n");
               arv.add(sc.nextInt());
            }else if(temp.equals("i")){
                arv.print();
            }else if(temp.equals("b")){
                System.out.println("Digite o número quqe você deseja buscar : \n");
                arv.buscaProfundidade(sc.nextInt());
            }
        };
    }
    
}
