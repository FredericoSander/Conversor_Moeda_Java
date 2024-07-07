package Conversor.service;

import Conversor.Modelo.ExchangeRateResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import com.google.gson.Gson;


public class ConverterMoeda {

    public static void converterMoeda(String moedaOrigem, String moedaDestino, double valor) throws IOException, InterruptedException {
    String endereco = "https://v6.exchangerate-api.com/v6/0924c562dfc13789ceb38c17/latest/" + moedaOrigem;
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();

    Gson gson = new Gson();
    ExchangeRateResponse exchangeRateResponse = gson.fromJson(json, ExchangeRateResponse.class);

    Map<String, Double> rates = exchangeRateResponse.getConversionRates();
    Double taxaConversao = rates.get(moedaDestino);

    if (taxaConversao != null) {
        double valorConvertido = valor * taxaConversao;
        System.out.println(" ");
        System.out.printf("Valor de " + valor+" "+ moedaOrigem + " corresponde ao valor final de: %.2f %s%n", valorConvertido, moedaDestino);
        System.out.println(" ");
    } else {
        System.out.println("Taxa de conversão não encontrada para " + moedaDestino);
    }
    }
}