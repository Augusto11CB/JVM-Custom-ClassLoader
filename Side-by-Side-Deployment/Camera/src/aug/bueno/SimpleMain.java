package aug.bueno;

import bueno.aug.ICamera;
import bueno.aug.ICameraFactory;
import bueno.aug.NikonCameraFactory;

public class SimpleMain {

    public static void main(String[] args) {
        ICameraFactory cameraFactory = new NikonCameraFactory();
        ICamera camera = cameraFactory.createCamera();

        camera.takePhoto();
    }
}