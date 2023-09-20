package bmicalc;

public class BMICalc {
    public static void main(String args[])
    {
          BMICalcView view = new BMICalcView();
          BMICalcModel model = new BMICalcModel();
          BMICalcController controller = new BMICalcController(model,view);

          view.registerOberver(controller);
    }
}