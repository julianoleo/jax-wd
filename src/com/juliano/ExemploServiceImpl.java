package com.juliano;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "com.juliano.ExemploService")
public class ExemploServiceImpl {
    @WebMethod
    public int calcula(int id) {
        return id+10;
    }
    @WebMethod
    public String exibeNome(String nome) {
        return nome;
    }
}
