package bueno.aug;

public class CanonCameraFactory implements ICameraFactory {
    @Override
    public ICamera createCamera() {
        return new CanonCamera();
    }
}
