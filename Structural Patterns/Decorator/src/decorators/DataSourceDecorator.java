package decorators;

public class DataSourceDecorator implements DataSource{
    private DataSource wrappee; //감싸는 객체를 참조

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
