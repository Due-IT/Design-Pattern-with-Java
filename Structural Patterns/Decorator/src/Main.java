import decorators.*;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(     //Compression > Encryption > FileDataSource 순으로 참조
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        /* CompressionDecorator.writeData > DataSourceDecorator.writeData
           > EncryptionDecorator.writeData > DataSourceDecorator.writeData
           > FileDataSource.writeData 순으로 호출됨
        */

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}