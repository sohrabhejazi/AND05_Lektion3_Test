package android.and05.lektion3.test;


import android.and05.lektion3.KeywordActivity;
import android.test.ActivityInstrumentationTestCase2;

public class KeywordActivityTest extends ActivityInstrumentationTestCase2<KeywordActivity> {
	private KeywordActivity activity;
	private String[] testData = {"@Teststichwort",
			"Fundstelle", "Text nur für den Test" };
	public KeywordActivityTest() {
		super("android.and05.lektion3", KeywordActivity.class);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		activity = this.getActivity();
	}
	public void testPreconditions() {
		assertNotNull(activity.getRegisterDB());
		assertNotNull(activity.getSourceIdentifier());
		assertTrue(!activity.getSourceIdentifier().equals(""));
		}
	public void testInsert() {
		assertTrue(activity.insert(testData[0],
		testData[1], testData[2]));
		assertTrue(activity.delete("stichwort='"
		+ testData[0] + "'"));
		}
}
