package project;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class shuzu2 
{
    public static void main(String args[])
    {
    	Random rd=new Random();
    	
        long Array[][]=new long[1000000][2];
        int count=0,length=0;
        File file = new File("shuzu.txt");
        BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        for(long k=0;k<1000000;k++){
        long   l   =   (long)(Math.random()*1000000000);
        String   s   =   ""+l;
        int   i   =   s.length();
       
//        for(int   j=0;j <2-i;j++){
//          s   =   "0"+s;
//        }
        int z;
        if((z=(int) (Math.random()*100))%2==0) {
        	s="-"+s;
        }
        System.out.println(s);
        try {
			writer.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        try {
			writer.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
              
 
        
        
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				
				String tmp;
				try {int i=0;
					while((tmp = br.readLine()) != null){
						Array[i][0]=Integer.parseInt(tmp);
						i++;
						length++;
					}
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Array[0][1]=Array[0][0];
		        for(int i=1;i<length;i++)
		        {
		            if(Array[i-1][1]<=0)
		            {
		                Array[i][1]=Array[i][0];
		            }
		            if(Array[i-1][1]>0)
		            {
		                Array[i][1]=Array[i-1][1]+Array[i][0];
		            }
		        }
		        long Max=Array[0][1];
		        for(int i=1;i<length;i++)
		        {
		            if(Array[i][1]>Max)
		            {
		                Max=Array[i][1];
		            }
		        }
		        System.out.println("数组最大值为："+Max);
		    }

}
