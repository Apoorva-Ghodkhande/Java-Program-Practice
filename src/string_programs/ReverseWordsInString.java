

package string_programs;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Reverse String Program";
   String[] strArr=str.split(" ");
   for(int index=strArr.length-1; index>=0;index--)
   {
	System.out.print(strArr[index]+" ");   
   }
	}

}
