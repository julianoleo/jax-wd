package com.juliano.cliente;

import java.net.URL;

public class Cliente {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/exemplo?wsdl");

        ExemploServiceImplService exemploServiceImplService
                = new ExemploServiceImplService(url);
        ExemploService exemploService
                = exemploServiceImplService.getExemploServiceImplPort();

        System.out.println(exemploService.calcula(10));
        System.out.println(exemploService.exibeNome("Juliano Leocádio Batista - IFTM 2021"));
    }
}
