package test99;

public class Text1 {
public static void main(String[] args) {
	/*int n=50;
	int m=n<<1;
	int k=n<<2;
	int a=n<<3;
	System.out.println(n);
	System.out.println(m);
	System.out.println(k);
	System.out.println(a);
	*/
	int n=-104;
	int m=n>>1;
	int k=n>>2;
	int h=n>>3;
	int g=n>>4;
	System.out.println(n);
	System.out.println(m);
	System.out.println(k);
	System.out.println(h);
	System.out.println(g);
	int a=n>>>1;
	System.out.println(a);
	System.out.println(Integer.toBinaryString(a));
/*int n=0x7d3aa87e;
	int b1=(n>>>24)&0xff;
	int b2=(n>>>16)&0xff;
	int b3=(n>>>8)&0xff;
	int b4=n&0xff;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(Integer.toBinaryString(b1));
	System.out.println(Integer.toBinaryString(b2));
	System.out.println(Integer.toBinaryString(b3));
	System.out.println(Integer.toBinaryString(b4));
	int a=0x9b00;
	int m=0xde;
	int k=m|a;
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toBinaryString(m));
	System.out.println(Integer.toBinaryString(k));
    */

	/*int m=10;
	  System.out.println(Integer.toBinaryString(m));
	  System.out.println(Integer.toBinaryString(~m));
	  System.out.println(Integer.toBinaryString(~m+1));
	  System.out.println("ok");
	  int min=Integer.MAX_VALUE;
	  System.out.println(Integer.toBinaryString(min));
	  System.out.println(Integer.toBinaryString(~min));
	  System.out.println(Integer.toBinaryString(~min+1));
	  long sum=Long.MIN_VALUE;
	  System.out.println("long");
	  System.out.println(Long.toBinaryString(sum));
	  System.out.println(Long.toBinaryString(~sum));
	  System.out.println(Long.toBinaryString(~sum+1));
	  System.out.println("&&&");
	  int s=0x4fbf417a;
	  int n=0xff;
	  int k=s&n;
	  System.out.println(Integer.toBinaryString(s));
	  System.out.println(Integer.toBinaryString(n));
	  System.out.println(Integer.toBinaryString(k));
	   
	  for(int i=0;i<10;i++){
		   System.out.println(":");
		   System.out.println(i&7);
		   System.out.println(":");
		   System.out.println(i%8);
	   }*/
}
}

