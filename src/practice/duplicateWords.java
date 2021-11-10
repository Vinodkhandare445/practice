package practice;

public class duplicateWords {

	public static void main(String[] args) {
		String ch=" Black nose big black rose big black dog  big rose";
		int count;
		ch=ch.toLowerCase();
		String chr[]=ch.split(" ");
		for(int i=1;i<chr.length;i++){
		count=1;
			for(int j=i+1;j<chr.length;j++){
			if(chr[i].equals(chr[j])){
			count++;
			chr[j]="0";

	}                               
	}
			if(count>1 && chr[i]!="0"){

			System.out.println(chr[i]);
			System.out.println(count);
	}

	}
	}
	}
