/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrana
 */
public class Array 
{
    public static void main(String args[])
    {
        int a[]={12,10,22,3,4,30};
        
        for(int i=0;i<a.length;i++)
        {  
            for(int j=i+1;j<a.length;j++)
            {  
                if(a[i]>a[j])
                {
                    int temp=0;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
            System.out.println(a[i       ]);
                
            
        }
        
    }   
}
