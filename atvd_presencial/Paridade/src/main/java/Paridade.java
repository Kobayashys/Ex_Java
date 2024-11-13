/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Aluno
 */
public class  Paridade{

    public static void main(String[] args) {
        String paridade;
        int Num[]= new int[16];
        
        for(int i=1;i<=16; i++){
            Num[i]= i;
            if(0==Num[i]%2){
                paridade= "par";
            }else{
                paridade= "impar";
            }
            System.out.println("O indicador do numero ["+i+"] eh ... :" +Num[i]+"   Esse numero é: "+paridade);
        }
        }            
        }