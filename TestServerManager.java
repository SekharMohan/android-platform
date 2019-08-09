package android.app;
import android.os.ITestServer;

public class TestServerManager {
    private static final String TAG = "TestServerMnager";
    private ITestServer  mServer;

    public TestServerManager(ITestServer server) {
        mServer = server;

    }

    public void setMessage(int value) {
        try {
            mServer.setValue(value);
            Log.d(TAG, "Value has been set successfully!");
        } catch (Exception e ) {
            Log.d(TAG, "Messed up!");
        }
    }

}
