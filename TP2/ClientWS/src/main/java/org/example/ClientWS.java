package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(10));
        Compte cp = proxy.getCompte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getDateCreation());
    }
}
