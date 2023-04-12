package string_programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str="string program practice";		
Map<Character,Integer> map= new HashMap();

char[] charArr= str.toCharArray();

for(char c: charArr)
{
	if(map.containsKey(c))
			{
		map.put(c, map.get(c)+1);
			}else
			{
				map.put(c, 1);
			}
	}

		System.out.println(map);
	}

}
