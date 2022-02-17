package com.axurchallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class Inspecao implements ControlesInspecao {
	
	@Override
	public void analise() throws MalformedURLException, IOException{
		boolean suspicious = false;
		boolean urlInvalida = false;
		String urlUsuario;
		Scanner ler = new Scanner(System.in);
		ListaRestricoes lista = new ListaRestricoes();
		lista.listaRestricoes();

		System.out.println("Por favor, insira uma url para inspeção: ");
		do {
			urlUsuario = ler.nextLine();
			urlInvalida = false;

			try {
				URL url = new URL(urlUsuario);
			} catch (MalformedURLException e) {
				System.out.println("URL invalida. Digite novamente.");
				urlInvalida = true;
			}
		} while (urlInvalida == true);

		URL url = new URL(urlUsuario);
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();

		while (linha != null) {

			for(int x = 0; x < lista.v.length; x++) {
			if ((linha.contains(lista.v[x]))) {
				suspicious = true;
			}
			}
			linha = br.readLine();
		}

		if (suspicious == true) {
			System.out.println("Suspicious - Detectada expressão/palavra suspeita");
		} else {
			System.out.println("Safe - Não possui expressões suspeitas");
		}
	}

}
