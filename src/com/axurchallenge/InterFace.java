package com.axurchallenge;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public interface InterFace {

	public abstract void analise(URL url) throws MalformedURLException, IOException;
}
