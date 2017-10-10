package ng.dat.ar;

import android.view.SurfaceView;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;


/**
 * Created by kolljohnson on 10/4/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ARCameraTest  {
    @Test
    public void setCameraSetsCameraToNull() {
        LegacyTestActivity activityContext = Robolectric.setupActivity(LegacyTestActivity.class);
        SurfaceView surfaceView = new SurfaceView(activityContext);

        ARCamera arCamera = new ARCamera(activityContext, surfaceView);
        arCamera.setCamera(null);
        assertNull(arCamera.camera);
    }
}
