package ty;

public class StringPurmutation {
	
	public static void main(String[] args) {
		
		String str = "ABC";
		int len = str.length();
		permute(str, 0, len-1); 
	}
    static void permute(String str, int ll, int rr) 
    { 
        if (ll == rr) 
            System.out.println(str); 
        else
        { 
            for (int i = ll; i <= rr; i++) 
            { 
                str = swap(str,ll,i); 
                permute(str, ll+1, rr); 
                str = swap(str,ll,i); 
            } 
        } 
    } 
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] Arr = a.toCharArray(); 
        temp = Arr[i] ; 
        Arr[i] = Arr[j]; 
        Arr[j] = temp; 
        return String.valueOf(Arr); 
    } 
  
	}
