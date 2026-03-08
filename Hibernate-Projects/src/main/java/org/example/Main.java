package org.example; // Declares this file belongs to the "org.example" package

import org.hibernate.Session; // Imports Session - used to interact with the database
import org.hibernate.SessionFactory; // Imports SessionFactory - used to create Session objects
import org.hibernate.Transaction; // Imports Transaction - used to manage DB transactions (commit/rollback)
import org.hibernate.cfg.Configuration; // Imports Configuration - used to configure Hibernate settings

import java.util.Arrays; // Imports Arrays utility - used to convert array to List

public class Main {
    public static void main (String[] args){

        // --- Create first Laptop object ---
        Laptop l1 = new Laptop(); // Creates a new Laptop instance
        l1.setLid(1);             // Sets laptop ID to 1
        l1.setBrand("Asus");      // Sets brand to "Asus"
        l1.setModel("Rog");       // Sets model to "Rog"
        l1.setRam(16);           // Sets RAM/storage (16GB)

        // --- Create second Laptop object ---
        Laptop l2 = new Laptop(); // Creates another Laptop instance
        l2.setLid(2);             // Sets laptop ID to 2
        l2.setBrand("Dell");      // Sets brand to "Dell"
        l1.setModel("Hehe");       // Sets model to "Rog"
        l2.setRam(32);           // Sets RAM/storage (32GB)

        // --- Create Alien (user/person) object ---
        Alien a1 = new Alien();               // Creates a new Alien instance
        a1.setAid(101);                       // Sets alien ID to 101
        a1.setAname("Adam");                   // Sets name to "Adam"
        a1.setTech("Java");                   // Sets preferred tech to "Java"
        a1.setLaptops(Arrays.asList(l1, l2)); // Assigns both laptops to this Alien (One-to-Many)

        // --- Set back-reference from Laptop to Alien (bidirectional relationship) ---
        l1.setAlien(a1); // Links l1 back to a1 (Many-to-One side)
        l2.setAlien(a1); // Links l2 back to a1 (Many-to-One side)

        // --- Configure Hibernate and build SessionFactory ---
        SessionFactory sf = new Configuration() // Creates a new Hibernate configuration
                .configure()                     // Loads hibernate.cfg.xml settings
                .addAnnotatedClass(Alien.class)  // Registers Alien as a mapped entity
                .addAnnotatedClass(Laptop.class) // Registers Laptop as a mapped entity
                .buildSessionFactory();          // Builds the SessionFactory (connects to DB)

        Session session = sf.openSession(); // Opens a new session (DB connection)

        Transaction transaction = session.beginTransaction(); // Starts a DB transaction
        session.persist(l1); // Saves l1 (Laptop) to the database
        session.persist(l2); // Saves l2 (Laptop) to the database
        session.persist(a1); // Saves a1 (Alien) to the database
        transaction.commit(); // Commits the transaction (makes changes permanent in DB)

        Alien a2 = session.find(Alien.class, 101); // Fetches Alien with ID 101 from DB
        System.out.println(a2); // Prints the retrieved Alien object

        session.close(); // Closes the session (releases DB connection) — note: was Session.close() (bug)
        sf.close();      // Closes the SessionFactory (releases all resources)
    }
}