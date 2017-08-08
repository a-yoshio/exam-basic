package q1;

/**
 * Q1. 1から10までの数値を足しあわせ、コンソールに出力しなさい。
 *
 * @author atsuko
 */
public class Sum {
	
	public static void main(String args[]){
		
		int total =0;
		
		for(int i=1;i<11;i++){
			
			total = total +i;
		}
		
		System.out.println(total);
	}

}
