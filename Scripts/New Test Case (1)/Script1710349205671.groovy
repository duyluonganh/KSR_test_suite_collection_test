import org.apache.commons.io.FileUtils

import com.kms.katalon.core.configuration.RunConfiguration

for (i in 1..1000) {
	String fileName = "SampleKeyword" + i
	String content = '''
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory



class SampleKeyword {
	@Keyword
	def demo() {
		println 'hello'
	}
}
'''
	content = content.replace("SampleKeyword" , fileName)
	File file = new File(RunConfiguration.getProjectDir(), "Keywords/" + fileName + ".groovy")
	FileUtils.write(file, content, "utf-8")
}