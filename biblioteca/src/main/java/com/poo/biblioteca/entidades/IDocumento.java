package com.poo.biblioteca.entidades;

import java.io.File;

public interface IDocumento {
    byte[] toByteArray(File conteudo);
    File toFile(byte[] conteudo); 
}
