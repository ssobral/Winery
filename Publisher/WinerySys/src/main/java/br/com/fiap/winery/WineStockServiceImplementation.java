package br.com.fiap.winery;

import jakarta.jws.WebService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        Map<String, List<String>> menu = new LinkedHashMap<>();

        menu.put("Syrah", List.of("Syrah Imperial 2017", "Syrah Clássico 2021"));
        menu.put("Tempranillo", List.of("Tempranillo Reserva 2019", "Tempranillo Jovem 2023"));
        menu.put("Sauvignon Blanc", List.of("Sauvignon Blanc Cristal 2022", "Sauvignon Blanc Floral 2024"));
        menu.put("Zinfandel", List.of("Zinfandel Intenso 2018", "Zinfandel Suave 2020"));

        StringBuilder menuString = new StringBuilder("Menu de Vinhos por Tipo de Uva:\n");

        for (Map.Entry<String, List<String>> entry : menu.entrySet()) {
            menuString.append("\n").append(entry.getKey()).append(":\n");
            for (String wine : entry.getValue()) {
                menuString.append(" - ").append(wine).append("\n");
            }
        }

        return menuString.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado";
    }
}
