package esercizio7;



public class Palindroma {
	
//		we
		public static boolean isPalindroma(String x) {
		int inizio=0;
		int fine = x.length()-1;
		int mezzo= fine/2;
		int i=0;
		for (i=0; i<=mezzo; i++) {
			if(x.charAt(inizio)==x.charAt(fine)) {
				inizio++;
				fine--;
			} else
				break;
		}
		if(i>mezzo) {
			return true;
		}
		else {
			return false;
		}
	}

}
