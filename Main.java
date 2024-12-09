public class Main {

    /*
     Класс Product представляет товар с его количеством, ценой и скидкой.
     Он предоставляет методы для расчета итоговой стоимости товара с учетом скидки.
     */
    static class Product {
        private int quantity; // Количество товаров
        private double price; // Цена товара
        private double discount; // Скидка на товар в процентах

        public Product(int quantity, double price, double discount) {
            this.quantity = quantity; // Инициализация количества товаров
            this.price = price;       // Инициализация цены товара
            this.discount = discount; // Инициализация скидки на товар
        }

        // Метод для расчета общей суммы покупки
        public double calculateTotal() {
            double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
            double totalDiscount = totalWithoutDiscount * (discount / 100); // Сумма скидки
            double totalWithDiscount = totalWithoutDiscount - totalDiscount; // Общая сумма со скидкой

            return Math.round(totalWithDiscount * 100.0) / 100.0; // Округление до 2 знаков после запятой
        }
    }

    // Метод main
    public static void main(String[] args) {

        Product product1 = new Product(10, 100.0, 0.75);   // Скидка 0.75%
        Product product2 = new Product(25, 200.0, 42.575);   // Скидка 42.575%
        Product product3 = new Product(33, 500.0, 59.1);     // Скидка 59.1%

        // Вызываем метод calculateTotal для каждого продукта и выводим результаты
        System.out.println("Итоговая сумма для товара 1: " + product1.calculateTotal());
        System.out.println("Итоговая сумма для товара 2: " + product2.calculateTotal());
        System.out.println("Итоговая сумма для товара 3: " + product3.calculateTotal());
    }
}
