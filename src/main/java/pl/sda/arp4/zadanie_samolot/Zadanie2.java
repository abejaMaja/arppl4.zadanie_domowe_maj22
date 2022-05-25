package pl.sda.arp4.zadanie_samolot.zadanie2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String miejsce = "";
        boolean stan = true;
      
       while (stan) {

            System.out.println("Podja kod siedzenia");
            miejsce = scanner.next();
            List <String> itemList = Arrays.asList("ABCDEF".split(""));
            List<String> list = Arrays.asList(miejsce.split(""));
                            
            if (miejsce.length()!=2){
                System.out.println("Kod musi zawierać dokładnie dwa znaki");
            }else if(!isContainsItemNumbersFromList(itemList, list)){
                System.out.println("Pierwasza litera kodu musi zawierac duza litere z zakresu A-F");
            }else{
                System.out.println("Dziękujemy za podanie miejsca, podałeś " + miejsce);
                stan = false;
            }
         
        }
       
    }
    
        public static boolean isContainsItemNumbersFromList(List<String> items, List<String> inputStr)
        {
               
            if(items.contains(inputStr.get(0)))
            {
              return true;
            }
           
            return false;
        }
    
}

