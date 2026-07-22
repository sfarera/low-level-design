package design_patterns.structural.decorator;

public class CompressionDecorator extends BaseDecorator{

    public CompressionDecorator(Datasource dataSource){
        super(dataSource);
    }

    @Override
    public String read() {
        String compressed = nextLayer.read();
        
        return decompress(compressed);
    }

    private String decompress(String compressed) {
        return compressed + "- Decompressed";
    }

    @Override
    public void write(String data) {
        String compressed = compress(data);
         nextLayer.write(compressed);

    }

    private String compress(String data) {
        return data + "-Compressed";
    }
}
