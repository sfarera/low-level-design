package design_patterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DataSourceTest {
    @Test
   public void testRead(){
        Datasource db = new FileDataSource();
        Assert.assertEquals("If read is called, base should be returned","Base",db.read() );
    }

    @Test
   public void testEncryption(){
        Datasource db = new FileDataSource();
        Datasource encryptedDb = new EncryptionDecorator(db);
        encryptedDb.read();
        Assert.assertEquals("If read is decrypted, base should be returned","Base- Decrypted",encryptedDb.read());

    }

    @Test
    public void testEncryptionCompression(){
        Datasource db = new FileDataSource();
        Datasource encryptedDb = new EncryptionDecorator(db);
        Datasource compressedDb = new CompressionDecorator(encryptedDb);
        compressedDb.read();
        Assert.assertEquals("If read is decrypted and decompressed, base should be returned","Base- Decrypted- Decompressed",compressedDb.read());

    }
        //EncryptedDatasource}

}
