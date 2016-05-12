package DB;

/**
 * Created by kobeb on 09.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        ClientDB client = new ClientDB("jdbc:mysql://localhost/ital","root","root");
        CityDB city = new CityDB("jdbc:mysql://localhost/ital","root","root");
        ProductDB product = new ProductDB("jdbc:mysql://localhost/ital","root","root");
        MeasureDB measure = new MeasureDB("jdbc:mysql://localhost/ital","root","root");
        TypeProductDB typeProduct = new TypeProductDB("jdbc:mysql://localhost/ital","root","root");
        SubtypeProductDB subtypeProduct = new SubtypeProductDB("jdbc:mysql://localhost/ital","root","root");
        OrderDB order = new OrderDB("jdbc:mysql://localhost/ital","root","root");
        TypePayDB typePay = new TypePayDB("jdbc:mysql://localhost/ital","root","root");
        DeliveryDB delivery = new DeliveryDB("jdbc:mysql://localhost/ital","root","root");
        TypeDeliveryDB typeDelivery = new TypeDeliveryDB("jdbc:mysql://localhost/ital","root","root");
        PlaceDeliveryDB placeDelivery = new PlaceDeliveryDB("jdbc:mysql://localhost/ital","root","root");

        client.createTable();
        city.createTable();
        product.createTable();
        measure.createTable();
        typeProduct.createTable();
        subtypeProduct.createTable();
        order.createTable();
        typePay.createTable();
        delivery.creatTable();
        typeDelivery.createTable();
        placeDelivery.createTable();


        client.addCity();
        product.addMeasure();
        product.addTypeProduct();
        typeProduct.addSubtypeProduct();
        order.addClient();
        order.addDelivery();
        order.addProduct();
        order.addTypePay();
        delivery.addCity();
        delivery.addPlaceDelivery();
        delivery.addTypeDelivery();

        client.closeConnection();
        city.closeCnnection();
        product.closeConnection();
        measure.closeConnection();
        typeProduct.closeConnection();
        subtypeProduct.closeConnection();
        order.closeConnection();
        typePay.closeConnection();
        delivery.closeConnection();
        typeDelivery.closeConnection();
        placeDelivery.closeConnection();

    }
}
