public class Switch {

    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Light mode");
                break;
            case "Night":
                System.out.println("Night!");
                break;
            case "Blue Dark":
                System.out.println("Blue Dark!");
                break;
            case "Dark":
                System.out.println("Dark Mode");
                break;
            default:
                System.out.println("Selecciona algo");
        }
    }
}
