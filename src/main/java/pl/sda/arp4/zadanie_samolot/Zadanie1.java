package pl.sda.arp4.zadanie_samolot.zadanie1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String miejsce = "";
        boolean stan = true;
      
        while (stan) {

            System.out.println("Podja kod siedzenia");
            miejsce = scanner.next();
            List <String> itemList = Arrays.asList("ABCD".split(""));
            List<String> list = Arrays.asList(miejsce.split(""));
                            
            if (miejsce.length()>3){
                System.out.println("Podales za dlugi kod");
            }else if(!isContainsItemFromList(itemList, list)){
                System.out.println("Kod musi zawierac duza litere z zakresu A-D");
            }else{
                System.out.println("Dziękujemy za podanie miejsca, podałeś " + miejsce);
                stan = false;
            }
         
        }
       
    }
    
        public static boolean isContainsItemFromList(List<String> items, List<String> inputStr)
        {
            for(int i =0; i < inputStr.size(); i++)
            {
                if(items.contains(inputStr.get(i)))
                {
                    return true;
                }
            }
            return false;
        }
    
}

