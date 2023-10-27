public class DAOHelloWorld implements IModel {
    private String fileName = "HelloWorld.txt";
    private String helloWorldMessage = "null";

    private static DAOHelloWorld instance = null;

    private DAOHelloWorld() {
    }

    public static DAOHelloWorld getInstance() {
        return instance;
    }
    private void setInstance(DAOHelloWorld instance){

    }

    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    private void readFile() {

    }


    @Override
    public String getHelloWord() {
        return HelloWord;
    }
}
