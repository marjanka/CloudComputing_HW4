import acm.program.*;

public class Fibonache extends ConsoleProgram{
	public void run(){
		while(true){
			int n = readInt("enter numeric: ");
					for(int i=0;i<=n; i++){
						if (fibon(i)<n){
				println(i+" - "+fibon(i));}
		}}}
		private int fibon(int n){
			if (n<=0)return 0;
			if (n==1)return 1;
			if (n==2)return 1;
		return fibon(n-1)+ fibon (n-2);}

}
