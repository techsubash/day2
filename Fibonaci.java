package week1.day2;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,range=8,firstnum=0,secnum=1,sum;
System.out.println(firstnum);
for(i=2;i<range;i++) {
	sum=firstnum+secnum;
	System.out.println(sum);
	firstnum=secnum;
	secnum=sum;
}
	}

}
