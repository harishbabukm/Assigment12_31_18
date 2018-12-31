package ty2;

class A1{
	public static void main(String[] args) {
		
	String arr [] = {"hello","bye","ello","oh","ho"};
	String str="hello",str1="";
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i].equals(str)){
			count++;
		}
		if(str.contains(arr[i].substring(0))){
			str1 = arr[i];
			int ch = str1.indexOf('o');
			System.out.println(ch);
			break;
		}
	}
	System.out.println("count"+count);
	
}
}