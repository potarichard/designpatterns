package proxy_pattern;

// olyan interfesz ami a class csak bizonyos methodjait eri el, (egy interfacen keresztul
// nyul bele a classba

// TLDR: LIMIT ACCSESS TO ANOTHER CLASS
public class ProxyPatternEx {

	public static void main(String[] args) 
	{
		Proxy px = new Proxy("long_crypto_message_takes long to decodedsjdn ncxycxmc,nieru84z3 ");		
		px.doSomeWork();
		px.doSomeWork();	// next time it dont do the heavy calculations again, the subject is cached in the proxy
	}

}
