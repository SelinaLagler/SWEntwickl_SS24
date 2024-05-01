package file_IO.products;

public class ProductDemo {

    public static void main(String[] args) {


        ProductManaer p = new ProductManaer();

        Product p1 = new Product("lksikeujf",98.43,"idk");
        Product p2 = new Product("lskjdg",398.3,"oiwhdf");
        p.add(p1);
        p.add(p2);

        try {
            p.save("productfile.txt");
        } catch (ProductSaveException e) {
            throw new RuntimeException(e);
        }
        try {


            p.load("productfile.txt");

        } catch (ProductLoadException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p);
    }
}
