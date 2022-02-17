package com.axurchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class AxurChallenge {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		URL url = new URL(" http://www.mocky.io/v2/5e18df272f00007e0097e1b4\r\n");
		
		Inspecao ler = new Inspecao();
		
		ler.analise(url);

	}

}
