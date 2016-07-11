package android.and05.lektion3.test;
import android.test.ActivityInstrumentationTestCase2;
import android.and05.lektion3.SourceActivity;
public class SourceActivityTest extends ActivityInstrumentationTestCase2<SourceActivity> {
	private SourceActivity activity;

	public SourceActivityTest() {
		super("android.and05.lektion3", SourceActivity.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		activity = this.getActivity();
	}
	public void testDelete() {
		assertTrue(activity.insert("and12","authors","titel","publisher","text"));
		assertTrue(activity.delete("and12"));
	}
}
