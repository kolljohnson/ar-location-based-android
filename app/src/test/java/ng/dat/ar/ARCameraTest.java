package ng.dat.ar;

import android.content.Context;
import android.graphics.Camera;
import android.test.AndroidTestCase;
import android.view.SurfaceView;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;


/**
 * Created by kolljohnson on 10/4/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ARCameraTest  {
    @Test
    public void setCameraSetsCameraToNull() {
        // need context
        Context context = RuntimeEnvironment.application;
        LegacyTestActivity testActivity = Robolectric.setupActivity(LegacyTestActivity.class);
        SurfaceView surfaceView = new SurfaceView(testActivity);

        ARCamera arCamera = new ARCamera(testActivity, surfaceView);
        arCamera.setCamera(null);
        assertNull(arCamera.camera);
    }
}
