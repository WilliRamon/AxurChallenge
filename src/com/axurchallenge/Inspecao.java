package com.axurchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

class Inspecao implements InterFace{

	@Override
	public void analise(URL url) throws MalformedURLException, IOException {
		boolean suspicious = false;
		
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		while(linha!=null){
			
			if ((linha.contains("senha")) || (linha.contains("black friday")) || (linha.contains("promoção"))) {
				suspicious = true;
			}
			linha = br.readLine();
		}
		
		if(suspicious==true)
		{
			System.out.println("suspicious");
		}else
		{
			System.out.println("safe");
		}
	}


}
