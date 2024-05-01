package file_IO.products;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class ProductManaer {

    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void add(Product p){
        products.add(p);

    }
    public void save ( String path) throws ProductSaveException{
        File f = new File(path);

        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f))){

            for (Product p :products){
                o.writeObject(p);
            }
            o.writeObject(null);
            o.flush();

        } catch (FileNotFoundException e) {
            throw new ProductSaveException(path,e);
        } catch (IOException e) {
            throw new ProductSaveException(path,e);
        }
    }

    public void load(String path) throws ProductLoadException {
        File f = new File(path);

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){

            Object obj ;

            while ((obj = ois.readObject()) == null){
                add((Product) obj);

            }

        } catch (FileNotFoundException e) {
            throw new ProductLoadException(path,e);
        } catch (IOException e) {
            throw new ProductLoadException(path,e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {

        return "ProductManaer{" +
                "products=" + products +
                '}';


    }
}
