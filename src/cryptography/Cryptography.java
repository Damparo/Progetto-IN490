package cryptography;

import java.math.BigInteger;

/*In attesa di capire dove è meglio mettere questi metodi, definiamo un'interfaccia*/

public interface Cryptography {

	/*Candidate è il presunto primo, iterations è un bound per il numero di test effettuati.*/

	public boolean solovayStrassen (BigInteger candidate, int iterations) {
		boolean isPrime = true;
		int i,l;
		BigInteger a;

		for(i=1; i<iterations; i++) {
			a = pickTest(candidate);
			l = legendre(a,candidate);
			a = modularExponentiation(a, candidate.subtract(BigInteger.ONE).divide(new BigInteger "2"), candidate)
			if(x==0 || a.remainder(candidate).compareTo(x)!=0)
				isPrime = false;
		}
		return(isPrime);
	}

	/*Bisognerebbe trovare un metodo più efficace per scegliere questi numeri senza ripetizioni*/
	private BigInteger pickTest (BigInteger candidate) {
		BigInteger s;
		do {
			s = new BigInteger(candidate.bitLength(), new Random())
		} while (s.compareTo(n)>=0);
		return(s);
	}

	//PARTE LUCIO
	//ALGORITMO SQUARE AND MULTIPLY

	public static BigInteger modularExponentiation(BigInteger base, BigInteger exp, BigInteger modulo) 
	{
		int length;	//lunghezza esponente in binario
		BigInteger potenza; //(base)^esponente
		length = exp.bitLength(); //lunghezza esponente
		//System.out.println("lunghezza:"+length);	
		String bin; //stringa binaria dell'esponente da usare nell'algoritmo
		bin=exp.toString(2); //esponente in binario
		//System.out.println("binario:"+bin);	
		
		if(exp.compareTo(BigInteger.ZERO)==0) //se l'esponente � 0
		{
			potenza=BigInteger.ONE; //ovviamente (base)^0=1 per ogni base
		}
		else //qui inizia l'algoritmo
			potenza=power(base, exp, modulo, bin, length);	
			
		return potenza;
	}

	public static BigInteger power(BigInteger base, BigInteger exp, BigInteger modulo, String bin, int length)
	{
		BigInteger potenza=base;
		BigInteger b;
		b=base;
		if(bin.charAt(length-1)==49)
			potenza=base;
		else
			potenza=BigInteger.ONE;
		int i;
		for(i=1; i<length; i++)
		{				
			potenza=potenza.pow(2).mod(modulo);
			//System.out.println("c:"+bin.charAt(length-1-i));	
			if(bin.charAt(length-1-i)==49)
			{
				potenza=potenza.multiply(base).mod(modulo);				}
			}
		return potenza;
	}
	
}