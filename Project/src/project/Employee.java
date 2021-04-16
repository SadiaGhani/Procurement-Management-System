/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.*;
import javax.swing.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL PC
 */
public class Employee {
    private String Ename;
    private String Email;
    private String Econtact;

   
           
      
     public boolean setName(String Ename)
  { 
    int size= Ename.length();
    boolean flag=false;
    for(int i=0; i<size; i++)
    {
      if((Ename.charAt(i)>='A' &&Ename.charAt(i)<='Z') ||( Ename.charAt(i)>='a' && Ename.charAt(i)<='z' )|| Ename.charAt(i)==' ')
      {
        flag = true;
        
      }
      else
      {
        flag= false;
        break;
      }
    }
    if(flag== true)
    {
        this.Ename= Ename;
    }
    
    return flag;
    
  }

    public String getName() {
        return Ename;
    }
    public boolean setContact(String Econtact)
    { 
        boolean flag = false;
        int size =Econtact.length();
        if(size == 11)
        {
        for(int i=0; i<size; i++)
        {
            if(Econtact.charAt(i)>= '0' && Econtact.charAt(i)<= '9')
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
            
        }
        }
        else
        {
            flag = false;
        }
        if(flag==true)
        {
            this.Econtact = Econtact;
        }
        return flag;
    }
     public String getEcontact() {
        return Econtact;
    }
     public boolean setEmail(String Email)
    {
        int size = Email.length();
        boolean flag = false;
        int i = 0;
        while(Email.charAt(i) != '@' && i<size)
        {
            if((Email.charAt(i)>= 'A' && Email.charAt(i)<= 'Z')||(Email.charAt(i)>= 'a' && Email.charAt(i)<= 'z') || (Email.charAt(i)>= '0' && Email.charAt(i)<= '9'))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        i++;
      
        while(i< size)
        {
            if((Email.charAt(i)>= 'A' && Email.charAt(i)<= 'Z')||(Email.charAt(i)>= 'a' && Email.charAt(i)<= 'z') || (Email.charAt(i)=='.'))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        if(flag==true)
    {
      this.Email=Email;
    }
        return flag;
    }

    public String getEmail() {
        return Email;
    }
     
    
    
}
