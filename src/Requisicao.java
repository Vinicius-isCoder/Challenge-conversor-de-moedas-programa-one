import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {

    private String url = "https://v6.exchangerate-api.com/v6/";
    private String chave = System.getenv("API_KEY");
    private String urlExtra = "/pair/";

    public double conversao(String moeda1, String moeda2) throws IOException, InterruptedException {
        String urlFinal = url + chave + urlExtra + moeda1 + "/" + moeda2;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlFinal))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement element = JsonParser.parseString(response.body());
        JsonObject object = element.getAsJsonObject();

        double taxaConversao = object.get("conversion_rate").getAsDouble();

        return taxaConversao;
    }
}