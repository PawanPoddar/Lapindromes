import java.util.*;

class practice
{
    public static void main(String arg[])
    {
        // String s="";
        Scanner sc=new Scanner(System.in);
        int va=sc.nextInt();
        while(va-- >0)
        {

            String s=sc.next();
            int count=0;

            char a[]=s.toCharArray();
            int len=s.length();
            int pos,sop;

            // System.out.println("length"+len);
            if(len%2==0)
            {
                pos=len/2;
                sop=len/2;

            }
            else
            {
                pos=len/2+1;
                sop=len/2;
                // System.out.println("soop "+sop);
            }


            
                // System.out.print(len/2);

                for(int i=0;i<len/2;i++)
                {
                    for(int j=pos;j<len;j++)
                    {
                        if(a[i]==a[j])
                            {
                            a[j]=' ';
                            // System.out.println("a[]="+a[i]);
                            count++;
                            break;
                            }

                    }
            
                   
            }
            if(count==sop)
                System.out.println("yes");
            else
                System.out.println("no");
            
                       
        }

    }
}