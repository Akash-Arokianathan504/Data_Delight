package business.DB4OUtil;

import business.ConfigureEcoSystem;
import business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Predicate;
import com.db4o.ta.TransparentPersistenceSupport;

public class DB4OUtil {

    private static final String FILENAME = "DataBank.db4o";
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);

            System.out.println("DB4O connection created successfully.");
            return Db4oEmbedded.openFile(config, FILENAME);
        } catch (Exception ex) {
            System.out.println("Error while creating DB4O connection: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        if (conn == null) {
            throw new IllegalStateException("DB4O connection could not be established.");
        }
        deleteOldSystem(conn);
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public void deleteOldSystem(ObjectContainer conn) {
        ObjectSet<EcoSystem> systems = conn.query(new Predicate<EcoSystem>() {
            @Override
            public boolean match(EcoSystem et) {
                return true;
            }
        });
        for (EcoSystem ecoSystem : systems) {
            conn.delete(ecoSystem);
        }
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        if (conn == null) {
            throw new IllegalStateException("DB4O connection could not be established.");
        }
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
        EcoSystem system;
        if (systems.isEmpty()) {
            system = ConfigureEcoSystem.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
