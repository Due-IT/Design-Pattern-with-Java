package decorators;

public class DataSourceDecorator implements DataSource{
    private DataSource wrappee; //상속하는 객체를 재참조?

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
