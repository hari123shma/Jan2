package opps;

public class problm {

	public static void main(String[] args) {
		// find out repeated charactor count in a string
		
               String s="Malayalam";
				char[] st=s.toCharArray();                                        //oru char akkan vendi
				int count;
				for(int i=0;i<st.length;i++)                                      //0 thottu 
				{
					count =1;                                                     // set 1 
					 for(int j=i+1;j<st.length;j++)                               
					 {
						 if(st[i]==st[j])
						 {
							 count++;
							 st[j]='0';
							 
						 }
					 }
					if(count>1 && st[i]!='0') 
					{
						System.out.println("repeating charactor= "+st[i]);
						System.out.println("count="+count);
					}
					
				}
         
	}

	}
