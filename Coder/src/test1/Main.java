	package test1;

	import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

	/**
	 * @author Administrator 输出所有子串
	 */
	public class Main {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			Main program=new Main();
			program.printAllSubString(str);
			program.printAllUniqueString(str);
		}

		public void printAllSubString(String str){
			for (int i = 0; i <= str.length(); i++) {
				for (int j = i + 1; j <= str.length(); j++) {
					System.out.println(str.subSequence(i, j));
				}
			}	
		}
		public void printAllUniqueString(String str){
			HashMap<String, String> hashmap=new HashMap<>();
				for (int i = 0; i <= str.length(); i++) {
					for (int j = i + 1; j <= str.length(); j++) {
						hashmap.put(str, "");
					}
				}
				Iterator iterator = hashmap.keySet().iterator();
				while(iterator.hasNext()) {
				System.out.println(hashmap.get(iterator.next()));
				}
		}
		
	}


