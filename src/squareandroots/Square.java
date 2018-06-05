package squareandroots;
import java.math.BigInteger ;
import java.lang.Math;
import java.lang.String;
import java.lang.Object;
public class Square 
{
	BigInteger a;
	BigInteger n;
	int t;
	BigInteger c;
	String x;
	BigInteger p;
	

	//COSTRUTTORI
	public Square(String[] args) 
	{
		this.a= new BigInteger(args[0]);//base
		this.n= new BigInteger(args[1]);//esponente
		this.t=n.bitLength();//lunghezza esponente in binario
		this.sett(n);//esponenete in binario
		this.p = new BigInteger(args[2]);//numero per modulare
		System.out.println("il numero da binariare è n="+this.n);
		System.out.println("la rappresentazione binaria è x="+this.x);
		System.out.println("la lunghezza è t="+this.t);
		System.out.println("il valore di a="+this.a);
		System.out.println("il valore di p="+this.p);
		/*
		if(this.x.charAt(0)==49)// COME IN C HO IL CODICE ASCII
		System.out.println("la lunghezza è t="+this.x.charAt(0));
		*/
		int i;
		if(this.n.compareTo(BigInteger.ZERO)==0)
		{
			this.c=BigInteger.ONE;
		}
		else
		{
			this.c=this.a;
			for(i=1;i<(this.t);i++)
			{
				this.c=this.c.pow(2).mod(p);
				if(this.x.charAt(i)==49)
				{
					this.c=this.c.multiply(this.a).mod(p);
				}
			}
		}
		System.out.println("il valore di c=a^n="+this.c);
	}

	//SETTERS
	
	public void sett(BigInteger n) {
		this.x = n.toString(2) ;
		
	}
		
	//GETTERS

	public BigInteger getc() 
	{
        return this.c;
	}
}