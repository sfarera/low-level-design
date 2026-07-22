package design_patterns.structural.decorator;

import javax.xml.crypto.Data;

//Step 4 : Create concrete decorator class.
public class EncryptionDecorator extends BaseDecorator{

    public EncryptionDecorator(Datasource nextLayer){
        super(nextLayer);
    }

    @Override
    public String read() {
        String data  = nextLayer.read();
        return decrypt(data);
    }

    private String decrypt(String data) {
        return data + "- Decrypted";
    }

    @Override
    public void write(String data) {
    String encrypted = encrypt(data);
    nextLayer.write(encrypted);
    }

    private String encrypt(String data) {
        return data+"-Encrypted";
    }
}
