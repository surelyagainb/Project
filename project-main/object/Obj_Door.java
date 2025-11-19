package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_Door extends SuperObject{
    
    public Obj_Door(){
        name = "Door";
       try {
        image = ImageIO.read(getClass().getResourceAsStream("/yes/door.png"));
        
       } catch (Exception e) {
        e.printStackTrace();
       }
       collision = true;
    }
}

