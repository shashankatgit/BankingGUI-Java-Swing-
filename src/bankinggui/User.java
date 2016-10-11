/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinggui;
import java.util.Random;
/**
 *
 * @author fragger
 */
public class User 
{
 static int MAXATTEMPTS = 3;
  
 static String bankName = "ROYAL HOLDINGS BANK";   
 static String uname;
 
 static SqlHandler curUser;
 static SqlHandler auxUser;
 
 public static int encodeSecurityA(String a)
 {
      return a.hashCode();
 }
 
 public static String encodePin(String pin)
        { 
            int i = Integer.parseInt(pin);
            int j =0;
            int k = 0;
            while(i>0)
            {
                k=i%10;
                if(j==0) 
                {
                    j+=(2*k+6);
                    i/=10;
                }
                else
                {
                    j*=100;
                    j+=(2*k+6);
                    i/=10;
                }
            }
            
            return Integer.toString(j);
            
        
        }
 
 static String generateAccNo()
 {
     String lastAccNo = SqlHandler.getLastAccNo();
     String curAccNo;
     curAccNo= Integer.toString((Integer.parseInt(lastAccNo))+1);
     return curAccNo;
 }
 
 static String generatePin()
 {
     int pin=0;
     Random r = new Random();
     for(int i=0;i<4;i++)
     {
         if(pin == 0) 
         {
             pin+=r.nextInt(10);
         }
         else
         {
             pin*=10;
             pin+=r.nextInt(10);
         }
     }
     return Integer.toString(pin);
 }
 
 
 static void initialize()
    {
    }
 
}
