public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        // set value
        product1.setName("Delonghi Kahve Makinası");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setDiscount(7);
        product1.setImageUrl("bilmemne.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinası");
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(3);
        product2.setDiscount(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinası");
        product3.setUnitPrice(4500);
        product3.setUnitsInStock(3);
        product3.setDiscount(4);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = {product1, product2, product3};

        // get value
        System.out.println("<ul>");
        for (Product product:
             products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05313333333");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Bilal");
        individualCustomer.setLastName("KEREMOĞLU");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("05323333333");
        corporateCustomer.setCustomerNumber("12346");
        corporateCustomer.setCompanyName("Toyota Otomotiv Sanayi LDT ŞTİ");
        corporateCustomer.setTaxNumber("1122334455");

        Customer[] customers = {individualCustomer, corporateCustomer};


    }
}
