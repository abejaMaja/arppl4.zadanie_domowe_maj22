package pl.arp4.zadanie_samolot.zadanie4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String miejsce = "";
        boolean stan = true;
      
       while (stan) {

            System.out.println("Podja kod siedzenia");
            miejsce = scanner.next();
            List <String> itemList = Arrays.asList("ABCDEF".split(""));
            List<String> list = Arrays.asList(miejsce.split(""));
            int dlugosc = miejsce.length();
                            
            if ((dlugosc != 2) && (dlugosc != 3)){
                System.out.println("Kod musi składać się tylko z dwóch lub trzech znaków");
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
                try {
                    Integer a = Integer.valueOf(inputStr.get(1));
                    if(inputStr.size()>2){
                        Integer b = Integer.valueOf(inputStr.get(2));
                        if(b >= 0){
                            return true;
                        }

                    }
                    
                    if(a >= 0){
                        return true;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Drugi i/lub trzeci znak kodu musi być cyfrą");
                    return false;
                }
                return true;
            }
            return false;
        }
    
}
