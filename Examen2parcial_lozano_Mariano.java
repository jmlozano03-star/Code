

import java.util.Scanner;
import java.util.ArrayList;

public class Examen2parcial_lozano_Mariano {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] productos = {
            "Chocolate", "Paleta", "Gomitas", "Galletas"
        };

        double[] precios = {18, 12, 25, 15};
        int[] vendidos = new int[4];

        ArrayList<String> clientes = new ArrayList<>();

        double totalGeneral = 0;
        String respuesta = "s";

        System.out.println("=== DULCERIA ===");

        // Registro de clientes
        do {
            System.out.print("Nombre del cliente: ");
            String nombre = sc.nextLine();

            clientes.add(nombre);

            double totalCliente = 0;

            // Registro de compras
            do {
                System.out.println("\n=== CATALOGO ===");

                for (int i = 0; i < productos.length; i++) {
                    System.out.println(
                        (i + 1) + ". " + productos[i] +
                        " - $" + precios[i]
                    );
                }

                int codigo;

                // Validar codigo
                do {
                    System.out.print("Codigo del producto (1-4): ");
                    codigo = Integer.parseInt(sc.nextLine());

                    if (codigo < 1 || codigo > 4) {
                        System.out.println("Codigo invalido.");
                    }

                } while (codigo < 1 || codigo > 4);

                int cantidad;

                // Validar cantidad
                do {
                    System.out.print("Cantidad: ");
                    cantidad = Integer.parseInt(sc.nextLine());

                    if (cantidad <= 0) {
                        System.out.println(
                            "La cantidad debe ser mayor que cero."
                        );
                    }

                } while (cantidad <= 0);

                double importe = 0;

                // Identificar producto con switch
                switch (codigo) {
                    case 1:
                        importe = precios[0] * cantidad;
                        break;

                    case 2:
                        importe = precios[1] * cantidad;
                        break;

                    case 3:
                        importe = precios[2] * cantidad;
                        break;

                    case 4:
                        importe = precios[3] * cantidad;
                        break;
                }

                // Registrar venta
                vendidos[codigo - 1] += cantidad;
                totalCliente += importe;

                System.out.println("Importe: $" + importe);
                System.out.println(
                    "Total del cliente: $" + totalCliente
                );

                System.out.print(
                    "Agregar otro producto? (s/n): "
                );

                respuesta = sc.nextLine();

            } while (respuesta.equalsIgnoreCase("s"));

            totalGeneral += totalCliente;

            System.out.println(
                "Total de " + nombre + ": $" + totalCliente
            );

            System.out.print("Atender otro cliente? (s/n): ");
            respuesta = sc.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        // Reporte de productos
        System.out.println("\n=== REPORTE DE VENTAS ===");

        int totalUnidades = 0;

        for (int i = 0; i < productos.length; i++) {

            double importeProducto = precios[i] * vendidos[i];

            System.out.println(
                productos[i] +
                " | Precio: $" + precios[i] +
                " | Vendidos: " + vendidos[i] +
                " | Importe: $" + importeProducto
            );

            totalUnidades += vendidos[i];
        }

        // Reporte final
        System.out.println("\n=== REPORTE FINAL ===");

        System.out.println(
            "Clientes atendidos: " + clientes.size()
        );

        System.out.println("Lista de clientes:");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(
                (i + 1) + ". " + clientes.get(i)
            );
        }

        System.out.println(
            "Unidades vendidas: " + totalUnidades
        );

        System.out.printf(
            "Total recaudado: $%.2f%n", totalGeneral
        );

        double promedio = totalGeneral / clientes.size();

        System.out.printf(
            "Promedio por cliente: $%.2f%n", promedio
        );

        sc.close();
    }
}
