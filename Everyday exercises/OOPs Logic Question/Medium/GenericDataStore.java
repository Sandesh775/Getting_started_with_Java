/*
* /**
 * DESIGN REQUIREMENT:
 *
 * Build a type-safe data store that can:
 * - Store any type of data
 * - Add, retrieve, remove by ID
 * - Search by property
 * - Handle errors properly
 *
 * YOUR TASK:
 *
 * 1. Create custom exceptions:
 *    - ItemNotFoundException extends Exception
 *    - DuplicateItemException extends Exception
 *
 * 2. Create interface: DataStore<T>
 *    - void add(int id, T item) throws DuplicateItemException
 *    - T get(int id) throws ItemNotFoundException
 *    - void remove(int id) throws ItemNotFoundException
 *    - List<T> getAll()
 *
 * 3. Create class: InMemoryDataStore<T> implements DataStore<T>
 *    - Use HashMap<Integer, T> internally
 *    - Implement all methods with proper exception handling
 *
 * 4. Create test classes:
 *    - Product (id, name, price)
 *    - User (id, username, email)
 *
 * 5. In main():
 *    - Create DataStore<Product>
 *    - Add 5 products
 *    - Try adding duplicate (catch exception)
 *    - Get by ID
 *    - Try getting non-existent ID (catch exception)
 *    - Remove item
 *    - Display all remaining
 *
 *    Then do same with DataStore<User>
 *
 * TIME LIMIT: 80 minutes
 */
// Custom Exceptions
import java.util.*;
class ItemNotFoundException extends Exception {
    public ItemNotFoundException() {
    }

    public ItemNotFoundException(String message) {
        super(message);
    }
}

class DuplicateItemException extends Exception {
    public DuplicateItemException() {
    }

    public DuplicateItemException(String message) {
        super(message);
    }
}

// Interface
interface DataStore<T> {
    void add(int id, T item) throws DuplicateItemException;
    T get(int id) throws ItemNotFoundException;
    void remove(int id) throws ItemNotFoundException;
    List<T> getAll();
}

// Implementation
class InMemoryDataStore<T> implements DataStore<T> {
    HashMap<Integer,T> hashMap = new HashMap<>();

    @Override
    public void add(int id, T item) throws DuplicateItemException {
        if(hashMap.containsKey(id)){
            throw new DuplicateItemException("key already exists !");
        }
        hashMap.put(id,item);
    }

    @Override
    public T get(int id) throws ItemNotFoundException {
        if(!hashMap.containsKey(id)){
            throw new DuplicateItemException("key didn't found !");
        }
        return hashMap.get(id);
    }

    @Override
    public void remove(int id) throws ItemNotFoundException {
        if(!hashMap.containsKey(id)){
            throw new DuplicateItemException("key didn't found !");
        }
        hashMap.remove(id);
    }

    @Override
    public List<T> getAll() {
        return List.of(hashMap.values());
    }
}

// Test classes
class Product {
    private int id;
    private String name;
    private Double price;

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class User {
    private int id;
    private String username;
    private String email;

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
}
public class GenericDataStore {
    public static void main(String[] args) {
        Product p1 = new Product(101,"Soap",45.0);
        Product p2 = new Product(102,"Diary Milk",145.0);
        Product p3 = new Product(103,"Milk",55.0);
        Product p4 = new Product(104,"Cookies",90.0);
        Product p5 = new Product(105,"Bread",40.0);

        DataStore<Product> productDataStore = new InMemoryDataStore<>();
        productDataStore.add(1,p1);
        productDataStore.add(2,p2);
        try {
            productDataStore.add(1,p1);
        } catch (DuplicateItemException e) {
            System.out.println(e.getMessage());
        }
        try {
            productDataStore.get(3);
        }catch (ItemNotFoundException e){
            System.out.println(e.getMessage());
        }
        productDataStore.remove(2);
        productDataStore.getAll();

        User u1 = new User(1,"John","Hello12@gmail.com");
        User u2 = new User(2,"Doe","Doe123@gmail.com");
        DataStore<User> userDataStore = new InMemoryDataStore<>();
        userDataStore.add(1,u1);
        try {
            userDataStore.add(1,u1);
        }catch (DuplicateItemException e){
            System.out.println(e.getMessage());
        }
        try{
            userDataStore.get(2);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
        userDataStore.remove(1);
        userDataStore.getAll();
    }
}
