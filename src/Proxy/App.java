package Proxy;

import java.math.BigDecimal;

public class App{
    public static void main(String[] args) {
        YoneticiProxy yoneticiProxy = new YoneticiProxy("yusuf", "12345");
        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println(ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur.");
        }
    }
}
