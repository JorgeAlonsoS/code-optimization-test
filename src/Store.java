public class Store {

    // Definir constantes para los precios de los productos
    private static final int[] PRICES = {15, 10, 5}; // Precios de los productos
    private static final int[] QUANTITIES = {2, 3, 4}; // Cantidades de los productos
    
    // Definir constante para el umbral de ventas
    private static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {
        int totalSales = 0;

        // Calcular las ventas totales usando arrays
        for (int i = 0; i < PRICES.length; i++) {
            totalSales += PRICES[i] * QUANTITIES[i];
        }

        // Evaluar el rendimiento de ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
