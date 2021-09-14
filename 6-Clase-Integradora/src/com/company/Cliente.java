package com.company;

public class Cliente {
    public static void main(String[] args) {
        SerieProxy proxy = new SerieProxy(new Serie());
        try {
            System.out.println(proxy.getSerie("Loki".replace(" ","")));
            System.out.println(proxy.getSerie("Gambito de Dama".replace(" ","")));
            System.out.println(proxy.getSerie("Stranger things".replace(" ","")));
            System.out.println(proxy.getSerie("Los 100".replace(" ","")));
            System.out.println(proxy.getSerie("Dirk Gentlys".replace(" ","")));
            System.out.println(proxy.getSerie("Peaky blinders".replace(" ","")));
       }
        catch (SerieNoHabilitadaException e) {
            System.out.println(e);
        };
    }
}
