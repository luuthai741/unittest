package junit6.util;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderRuleTest {
	@Rule
	// Tạo file và folder tạm thời sau khi test xong sẽ bị xoá
	public TemporaryFolder temporaryFolder = new TemporaryFolder();
	
	@Test
	public void test() throws IOException {
		File folder = temporaryFolder.newFolder("new1");
		File file = temporaryFolder.newFile("new2");
		Assert.assertTrue(folder.exists());
		Assert.assertTrue(file.exists());
	}
}
