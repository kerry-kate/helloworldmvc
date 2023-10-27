
public class Controller{
    private final IVIew view;
    private final IModel model;

    public Controller(final IVIew view,final IModel model){
        this.view = view;
        this.model = model;

    }
    public void run(){
        this.view.displayMessage(this.model.getHelloWord());
    }
}
