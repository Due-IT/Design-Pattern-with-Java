package decorators;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    public String readData() {
        return new String(Base64.getDecoder().decode(super.readData()),  StandardCharsets.UTF_8);
    }
}
