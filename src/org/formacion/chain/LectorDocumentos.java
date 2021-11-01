package org.formacion.chain;

public interface LectorDocumentos {

	boolean acepta(Documento documento);
	String contenido(Documento documento);
	
}
