
public class Main {
    
    public static void main(String[] args) {
        
        // Create the model, view, and controller
        Model model = new Model();
        
        View view = new View();
        
        Controller controller = new Controller(model, view);

        // Set the data and update the view
        controller.setData("Assalam u Alailkum From Abdul Rahman");
        
        controller.updateView();
        
    }
    
}

